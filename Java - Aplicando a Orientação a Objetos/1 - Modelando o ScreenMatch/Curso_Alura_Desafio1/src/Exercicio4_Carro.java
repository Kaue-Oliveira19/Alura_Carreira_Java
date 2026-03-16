/*
    4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do
    carro.
 */

public class Exercicio4_Carro {
    String modelo;
    int ano;
    String cor;

    void exibaFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int retornaIdadeCarro(){
        return 2026 - ano;
    }
}

