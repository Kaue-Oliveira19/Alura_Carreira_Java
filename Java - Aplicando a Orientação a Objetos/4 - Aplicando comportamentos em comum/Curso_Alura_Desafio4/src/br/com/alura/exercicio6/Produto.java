package br.com.alura.exercicio6;

public class Produto implements Vendavel{
    @Override
    public double calcularPrecoFinal(double preco, int qtd) {
        double porcentagemDesconto = 10;
        double precoTotalProdutos = qtd * preco;
        return precoTotalProdutos - ((qtd * preco) * (porcentagemDesconto / 100));
    }
}
