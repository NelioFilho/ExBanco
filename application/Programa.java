package application;

import java.util.Scanner;
import entities.Funcao;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcao dados;

        System.out.print("Digite sua conta: ");
        int conta = sc.nextInt();
        System.out.print("Digite o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Deseja realizar o primeiro depósito? (s/n): ");
        char resposta = sc.next().charAt(0);

        if (resposta != 'n'){
            System.out.print("Digite o valor para depositar: ");
            double depositoInicial = sc.nextDouble();
            dados = new Funcao(conta, titular, depositoInicial);
        }else{
            dados = new Funcao(conta, titular);
        }

        char resp;
        do{
            System.out.print("Deseja realizar alguma movimentação? (s/n): ");
            resp = sc.next().charAt(0);
        
            if (resp == 's'){
                System.out.println("Selecione: Saque (s) ou Depósito (d)");
                char opcao = sc.next().charAt(0);
                switch (opcao) {
                    case 's':
                        System.out.print("Digite um valor para sacar: ");
                        double saque = sc.nextDouble();
                        dados.saque(saque);
                        break;
                    case 'd':
                        System.out.print("Digite um valor para depositar: ");
                        double deposito = sc.nextDouble();
                        dados.deposito(deposito);
                        break;
                
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }else{
                System.out.println("Obrigado por usar nosso sistema.");
            }
        }while(resp == 's');


        System.out.println(dados);
        sc.close();
    }
}
