package br.com.alura.exercicio6;

public class Servico implements Vendavel{
    @Override
    public double calcularPrecoFinal(double preco, int qtd) {
        double porcentagemDesconto = 10;
        return preco - (preco * (porcentagemDesconto / 100));
    }
}
