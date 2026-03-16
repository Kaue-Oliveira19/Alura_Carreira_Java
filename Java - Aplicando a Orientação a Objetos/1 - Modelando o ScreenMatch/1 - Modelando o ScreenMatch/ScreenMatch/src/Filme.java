public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliaçoes;
    int totalDeAvaliaçoes;
    int duracaoEmMinutos;

    void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliaçoes += nota;
        totalDeAvaliaçoes++;
    }

    double pegaMedia(){
        return somaDasAvaliaçoes / totalDeAvaliaçoes;
    }
}
