package br.com.alura.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricacao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricacao() {
        return descricacao;
    }

    public void setDescricacao(String descricacao) {
        this.descricacao = descricacao;
    }

    @Override
    public int getClassificacao(){
        if (this.getTotalCurtidas() >= 1000){
            return 10;
        } else {
            return 6;
        }
    }
}
