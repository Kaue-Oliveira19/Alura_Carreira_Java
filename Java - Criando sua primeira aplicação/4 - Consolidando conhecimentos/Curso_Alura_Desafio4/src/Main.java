import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome = "Kauê dos Santos Oliveira da Silva";
        String tipoConta = "Conta Corrente";
        double saldoInicial = 7000;
        int opcao = 0;
        double valorReceber = 0;
        double valorTransferir = 0;
        boolean repetir = true;

        System.out.println(String.format("""
                ******************************

                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                
                ******************************
                """, nome, tipoConta, saldoInicial));

        do{
            System.out.println("""
                Operações
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """);

            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("O saldo atual é: R$" + saldoInicial);
                    break;

                case 2:
                    System.out.println("Informe o valor a receber:");
                    valorReceber = scan.nextInt();

                    saldoInicial += valorReceber;

                    System.out.println("Saldo atualizado: R$" + saldoInicial);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valorTransferir = scan.nextInt();

                    if(saldoInicial >= valorTransferir){
                        saldoInicial -= valorTransferir;

                        System.out.println("Saldo atualizado: R$" + saldoInicial);
                    } else{
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }

                case 4:
                    System.out.println("Aplicativo fechado");
                    repetir = false;
                    break;
                default:
                    System.out.println("Açaõ inválida! Digite novamente.");
            }
        }while(repetir);
    }
}