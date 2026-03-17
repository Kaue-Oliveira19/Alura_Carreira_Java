package br.com.alura.exercicio5;

/*
    5 - Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
    Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
 */


public class ProdutoFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        double porcentagemImposto = 5;
        return preco - (preco * (porcentagemImposto / 100));
    }
}
