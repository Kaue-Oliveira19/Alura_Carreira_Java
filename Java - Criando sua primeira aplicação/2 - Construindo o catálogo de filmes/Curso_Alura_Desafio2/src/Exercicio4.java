/*
    4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total
    multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
 */

public class Exercicio4 {
    public static void main(String[] args){
        double precoProduto = 4.49;
        int quantidade = 10;

        double resultado = quantidade * precoProduto;

        System.out.println(String.format("Preço total do produto: R$%.2f", resultado));
    }
}
