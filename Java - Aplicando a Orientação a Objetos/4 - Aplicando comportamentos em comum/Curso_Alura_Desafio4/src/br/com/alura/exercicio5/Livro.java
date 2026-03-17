package br.com.alura.exercicio5;

/*
    5 - Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
    Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */


public class Livro implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double porcentagemDesconto = 10;
        return preco - (preco * (porcentagemDesconto / 100));
    }
}
