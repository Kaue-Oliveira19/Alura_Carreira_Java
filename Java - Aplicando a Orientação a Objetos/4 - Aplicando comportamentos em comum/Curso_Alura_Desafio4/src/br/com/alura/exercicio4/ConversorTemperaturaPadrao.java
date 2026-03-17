package br.com.alura.exercicio4;

/*
    4 - Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
    Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe
    os resultados.
 */

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double tempFahrenheit){
        return (tempFahrenheit - 32) / 1.8;
    }
}
