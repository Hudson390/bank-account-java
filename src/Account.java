
public class Account {
    private double saldo;
    public double saldoInicial;
    private double valorDebitos;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        saldoInicial = chequeValor(saldo);
        this.saldo = saldo + saldoInicial;
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

    public void lerSaldo(double saldo){
        System.out.println("Saldo: " + saldo);
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
        
    }

    public void calcValorTaxa(double valor){
        valorDebitos = valorDebitos + (valor * 0.2);
    }

    public void cobrarTaxas(){
        var valorSaldo = (saldo - saldoInicial); // 12000
        if ( valorSaldo > 0 && valorDebitos < valorSaldo) {
            saldo = saldo - valorDebitos;
            System.out.println("Pagamento de debito do cheque especial:");
            System.out.println("Saldo: " + saldo);
            LimparTela.limparConsole(40);
        } else if (valorSaldo < valorDebitos && valorSaldo > 0) {
            saldo = saldo -  valorSaldo;
            valorDebitos = valorDebitos - valorSaldo;
            System.out.println("Pagamento de debito do cheque especial:");
            System.out.println("Saldo: " + saldo);

        }

    }


}
