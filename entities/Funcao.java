package entities;

public class Funcao {
    private int conta;
    private String titular;
    private double saldo;

    public Funcao(int conta, String titular){
        this.conta = conta;
        this.titular = titular;
    }

    public Funcao(int conta, String titular, double saldo){
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getConta(){
        return conta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double deposito){
        deposito += saldo;
    }

    public void saque(double saque){
        saque -= saldo + 5;
    }

    public String toString(){
        return "Conta: " + conta + " - Titular: " + titular + " - Saldo: R$" + saldo;
    }
}
