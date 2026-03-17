package br.com.alura.exercicio3;

/*
    3 - Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para
    exibir a tabuada de um número. A classe deve receber o número como parâmetro.
 */

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int num) {
        for(int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " X " + i + " = " + resultado);
        }
    }
}
