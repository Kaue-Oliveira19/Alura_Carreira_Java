package br.com.alura.exercicio5;

/*
    5 - Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
    Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */


public interface Calculavel {
    double calcularPrecoFinal(double preco);
}
