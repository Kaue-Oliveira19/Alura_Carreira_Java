/*
    3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
    exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
 */

public class Exercicio3_Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliaçoes;

    void exibaFichaTecnica(){
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliaçoes++;
    }

    double calculaMediaAvaliaçoes(){
        return avaliacao / numAvaliaçoes;
    }

}
