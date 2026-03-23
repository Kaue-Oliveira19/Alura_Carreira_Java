package br.com.alura.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes){
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalDeReproducoes(){
        return totalDeReproducoes;
    }

    public void setTotalCurtidas(int totalCurtidas){
        this.totalCurtidas = totalCurtidas;
    }

    public int getTotalCurtidas(){
        return totalCurtidas;
    }

    public void setClassificacao(int classificacao){
        this.classificacao = classificacao;
    }

    public int getClassificacao(){
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }
}
