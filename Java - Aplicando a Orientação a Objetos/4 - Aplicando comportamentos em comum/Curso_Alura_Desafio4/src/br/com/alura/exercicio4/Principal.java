package br.com.alura.exercicio4;

/*
    4 - Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe
    os resultados.
 */

public class Principal {
    public static void main(String[] args){
        ConversorTemperaturaPadrao objTemp = new ConversorTemperaturaPadrao();

        System.out.println("Temperatura em Celsius: " + objTemp.celsiusParaFahrenheit(20) + "C°");
        System.out.println("Temperatura em Celsius: " + objTemp.fahrenheitParaCelsius(68) + "F°");
    }
}
