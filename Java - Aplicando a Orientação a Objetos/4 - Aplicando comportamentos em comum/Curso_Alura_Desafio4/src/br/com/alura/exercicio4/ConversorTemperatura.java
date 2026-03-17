package br.com.alura.exercicio4;

/*
    4 - Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe
    os resultados.
 */

public interface ConversorTemperatura {
    double celsiusParaFahrenheit(double tempCelsius);
    double fahrenheitParaCelsius(double tempFahrenheit);
}
