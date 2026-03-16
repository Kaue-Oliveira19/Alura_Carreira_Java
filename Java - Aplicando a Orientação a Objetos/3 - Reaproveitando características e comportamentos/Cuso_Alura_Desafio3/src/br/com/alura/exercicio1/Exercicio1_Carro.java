package br.com.alura.exercicio1;

/*
    1 -Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos
    para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione
    uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e
    mostrar informações.
 */

public class Exercicio1_Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void calcularPrecoMedio(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenor(){
        double menorPreco;
        if (precoAno1 < precoAno2 && precoAno1 < precoAno3){
            menorPreco = precoAno1;
        } else if (precoAno2 < precoAno1 && precoAno2 < precoAno3){
            menorPreco = precoAno2;
        } else {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calcularMaior(){
        double maiorPreco;
        if (precoAno1 > precoAno2 && precoAno1 > precoAno3){
            maiorPreco = precoAno1;
        } else if (precoAno2 > precoAno1 && precoAno2 > precoAno3){
            maiorPreco = precoAno2;
        } else {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    public double calcularMedia(){
        double precoMedio;
        return precoMedio = (precoAno1 + precoAno2 + precoAno3) / 3;
    }

    public void especificacao(){
        System.out.println("Nome modelo: " + modelo);
        System.out.println("Preço no primeiro ano: " + precoAno1);
        System.out.println("Preço no segundo ano: " + precoAno2);
        System.out.println("Preço no terceiro ano: " + precoAno3);
        System.out.println("Maior preço: " + calcularMaior());
        System.out.println("Menor preço: " + calcularMenor());
        System.out.println("Preço médio: " + calcularMedia());
    }
}
