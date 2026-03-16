package br.com.alura.exercicio1;

/*
    1 -Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
    para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione
    uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e
    mostrar informações.
 */

public class Exercicio1_Principal {
    public static void main(String[] args){
        Exercicio1_ModeloCarro objCarro = new Exercicio1_ModeloCarro();
        objCarro.definirModelo("Fiat Mobi");
        objCarro.calcularPrecoMedio(35000, 45000, 30000);
        objCarro.especificacao();
    }
}
