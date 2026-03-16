package br.com.alura.exercicio3;

/*
    3 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
    consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método
    específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */

public class Exercicio3_ContaBancaria {
    protected double saldo;

    //Métodos

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
        System.out.println("Deposito de R$" + saldo + " realizado. Saldo atual: R$" + saldo);
    }

    public void sacar(double valorSaque){
        if (valorSaque > saldo){
            System.out.println("Dinheiro insuficiente para realizar o saque!");
        } else{
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado. Saldo atual: R$" + saldo);
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }

}
