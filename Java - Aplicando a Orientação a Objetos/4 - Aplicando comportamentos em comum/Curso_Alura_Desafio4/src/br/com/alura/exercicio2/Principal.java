package br.com.alura.exercicio2;

/*
    2 - Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
    calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
    receber altura e largura como parâmetros.
 */

public class Principal {
    public static void main(String[] args){
        CalculadoraSalaRetangular objCalculadora = new CalculadoraSalaRetangular();

        System.out.println("Área do retângulo: " + objCalculadora.calcularArea(5, 10) + "cm²");
        System.out.println("Área do retângulo: " + objCalculadora.calcularPerimetro(5, 10) + "cm");
    }
}
