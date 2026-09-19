
public class Account {
    private double saldo;
    public double saldoInicial;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        saldoInicial = chequeValor(saldo);
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
        if (saldo <= 500){
            valor = 50;
        } else {
            valor = saldo * 0.5;
        }

        return valor;
    }

    public void sacarValorCheque(double valor){
        this.saldoInicial -= valor;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

}
