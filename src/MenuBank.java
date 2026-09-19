import java.util.Scanner;


public class MenuBank {

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
            case 1:
                lerSaldo(account.getSaldo());
                break;
            case 2:
                System.out.println("Cheque Especial: ");

                double valorChequeEspecial = account.chequeValor(account.getSaldoInicial());

                System.out.println("Saldo: " + valorChequeEspecial);
                break;
            case 3:
                System.out.print("Informe o valor para depósito: ");

                double valor = scanner.nextDouble();

                account.depositarValor(valor);

                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Novo saldo: " + account.getSaldo());
                break;
            case 4:
                System.out.print("Informe o valor para saque: ");
                double valor1 = scanner.nextDouble();

                account.sacarValor(valor1);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: " + account.getSaldo());
                break;
            case 5:
                System.out.print("Informe o valor do boleto: ");
                double valor2 = scanner.nextDouble();

                account.pagarValor(valor2);
                System.out.println("Boleto pago com sucesso!");
                System.out.println("Novo saldo: " + account.getSaldo());
                break;
        }
    }


    public void lerSaldo(double saldo){
        System.out.println("Saldo: " + saldo);
    }

}

