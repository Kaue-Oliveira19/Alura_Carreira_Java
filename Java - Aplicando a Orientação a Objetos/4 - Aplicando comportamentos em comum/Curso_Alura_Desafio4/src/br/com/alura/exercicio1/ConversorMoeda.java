package br.com.alura.exercicio1;

/*
    1 - Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
    converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como
    parâmetro.
 */

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorDolar = 5.20;

    @Override
    public double conveterDolarParaReal(double dolar) {
        return dolar * valorDolar;
    }
}
