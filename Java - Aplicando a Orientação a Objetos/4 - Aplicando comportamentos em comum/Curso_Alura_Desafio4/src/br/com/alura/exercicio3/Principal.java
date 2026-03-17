package br.com.alura.exercicio3;

/*
    3 - Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para
    exibir a tabuada de um número. A classe deve receber o número como parâmetro.
 */

public class Principal {
    public static void main(String[] args){
        TabuadaMultiplicacao objTabuada = new TabuadaMultiplicacao();

        objTabuada.mostrarTabuada(5);
    }
}
