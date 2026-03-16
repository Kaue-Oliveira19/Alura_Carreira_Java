package br.com.alura.exercicio3;

/*
    3 - Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
    consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método
    específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
 */

public class Exercicio3_Principal {
    public static void main(String[] args) {
        Exercicio3_ContaCorrente objConta1 = new Exercicio3_ContaCorrente();
        objConta1.depositar(7000);
        objConta1.sacar(100);
        objConta1.cobrarTarifaMensal();
        objConta1.sacar(10000);
        objConta1.consultarSaldo();
    }
}
