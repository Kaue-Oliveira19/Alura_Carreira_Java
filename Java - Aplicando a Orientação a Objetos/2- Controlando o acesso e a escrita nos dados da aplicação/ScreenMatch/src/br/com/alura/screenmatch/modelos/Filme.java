package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliaçoes;
    private int totalDeAvaliaçoes;
    private int duracaoEmMinutos;

    //Métodos

    public void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração do filme: " + duracaoEmMinutos);
        System.out.println("Total de avaliações: " + totalDeAvaliaçoes);
        System.out.println("Incluído no plano: "  + incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliaçoes += nota;
        totalDeAvaliaçoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliaçoes / totalDeAvaliaçoes;
    }

    //Getters - Buscar valor
    public int getTotalDeAvaliaçoes(){
        return totalDeAvaliaçoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Setters - Incluir valor no atributo


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
