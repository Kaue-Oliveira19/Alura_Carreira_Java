/*
    5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o
     valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
     resultado formatado.
 */

public class Exercicio5 {
    public static void main(String[] args){
        double valorEmDolares = 10;
        double resultado = valorEmDolares * 4.94;

        System.out.println(String.format("Valor em Reais: R$%.2f", resultado));
    }
}
