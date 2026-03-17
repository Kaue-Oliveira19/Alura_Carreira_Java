package br.com.alura.exercicio5;

/*
    5 - Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
    Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */

public class Principal {
    public static void main(String[] args){
        Livro objLivro = new Livro();
        ProdutoFisico objProduto = new ProdutoFisico();

        System.out.println("Preço do livro com desconto: R$" + objLivro.calcularPrecoFinal(50));
        System.out.println("Preço do livro com desconto: R$" + objProduto.calcularPrecoFinal(50));
    }
}
