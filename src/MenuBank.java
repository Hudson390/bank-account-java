import java.util.Scanner;


public class MenuBank {

    private boolean VerifyCheck = true;

    public void iniciar(){
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Consultar Cheque Especial");
        System.out.println("3. Depositar");
        System.out.println("4. Sacar");
        System.out.println("5. Pagar Boleto");
        System.out.println("6. Verificar se a conta está usando cheque especial");
        System.out.println("7. Sair");
        System.out.println("Selecione sua opção: ");
    }

    public void lerOpcao(int option, Account account){
        var scanner = new Scanner(System.in);
        LimparTela.limparConsole(10);

        switch (option){
            case 1: // SALDO NA CONTA
                lerSaldo(account.getSaldo());
                break;
            case 2: // CHEQUE ESPECIAL
                System.out.println("Cheque Especial: ");

                double valorChequeEspecial = account.saldoInicial;

                System.out.println("Saldo: " + valorChequeEspecial);
                break;
            case 3: // DEPOSITO
                System.out.print("Informe o valor para depósito: ");

                double valor = scanner.nextDouble();

                if (valor >= 0 ){
                    account.depositarValor(valor);

                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Novo saldo: " + account.getSaldo());
                } else {
                    System.out.println("Valor Inválido!!!");
                }
                break;
            case 4: // SAQUE
                System.out.print("Informe o valor para saque: ");
                double valor1 = scanner.nextDouble();

                if (valor1 <= account.getSaldo() && valor1 > 0){
                    account.sacarValor(valor1);
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Novo saldo: " + account.getSaldo());
                } else if (valor1 >= account.getSaldo() && account.getSaldoInicial() > 0 && valor1 <= account.getSaldoInicial()) {
                    VerifyCheck = false;
                    account.sacarValorCheque(valor1);

                } else if (valor1 < 0) {
                    System.out.println("Valor Inválido!!!");
                } else {
                    System.out.println("Saldo insuficiente!!!");
                }
                break;
            case 5: // PAGAMENTO DE BOLETO
                System.out.print("Informe o valor do boleto: ");
                double valor2 = scanner.nextDouble();

                account.pagarValor(valor2);
                System.out.println("Boleto pago com sucesso!");
                System.out.println("Novo saldo: " + account.getSaldo());
                break;
            case 6:
                if (!VerifyCheck){
                    System.out.print("A conta esta utilizando o cheque especial. ");
                }else {
                    System.out.print("A conta não esta utilizando o cheque especial. ");
                }

        }
    }


    public void lerSaldo(double saldo){
        System.out.println("Saldo: " + saldo);
    }

}

