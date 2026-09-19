
public class Account {
    private double saldo;
    private double saldoInicial;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        saldoInicial = saldo;
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

    public double chequeValor(double valor){
        if (saldoInicial <= 500){
            valor = 50;
        } else {
            valor = saldoInicial * 0.5;
        }

        return valor;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

}
