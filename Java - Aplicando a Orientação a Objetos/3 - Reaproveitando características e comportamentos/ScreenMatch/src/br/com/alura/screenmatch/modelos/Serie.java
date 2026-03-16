package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private boolean ativa;
    private int minutosPorEpisodio;

    //Getters

    public int getTemporadas(){
        return temporadas;
    }

    public int getEpisodiosPorTemporadas(){
        return episodiosPorTemporadas;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public int getMinutosPorEpisodios(){
        return minutosPorEpisodio;
    }

    //Setters

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public void setEpisodioPorTemporadas(int episodiosPorTemporadas){
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void setminutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //Método

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }
}
