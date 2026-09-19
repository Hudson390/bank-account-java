package com.br.studyingclass.studyingrecord.bankaccount;

public class Account {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarValor(double valor){
        this.saldo += valor;
    }

    public void sacarValor(double valor){
        this.saldo -= valor;
    }

    public void pagarValor(double valor){
        this.saldo -= valor;
    }
}
