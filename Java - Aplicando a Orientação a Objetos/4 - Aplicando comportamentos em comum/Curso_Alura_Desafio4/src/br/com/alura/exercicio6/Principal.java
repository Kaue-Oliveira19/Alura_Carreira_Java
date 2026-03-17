package br.com.alura.exercicio6;

public class Principal {
    public static void main(String[] args){
        Produto objProduto = new Produto();
        Servico objServico = new Servico();

        System.out.println("Desconto total dos produtos: R$" + objProduto.calcularPrecoFinal(50, 10));
        System.out.println("Desconto total do serviço: R$" + objServico.calcularPrecoFinal(50, 10));
    }
}
