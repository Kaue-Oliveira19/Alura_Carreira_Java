package br.com.alura.exercicio3;

/*
    3 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
    consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método
    específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */

public class Exercicio3_ContaCorrente extends Exercicio3_ContaBancaria{
    private double tarifa = 5;

    public void cobrarTarifaMensal(){
        saldo -= tarifa;
        System.out.println("Tarifa de R$" + tarifa + " cobrada. Saldo atual: R$" + saldo);
    }
}
