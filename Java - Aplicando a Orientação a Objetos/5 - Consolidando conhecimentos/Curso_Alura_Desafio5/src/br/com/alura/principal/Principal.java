package br.com.alura.principal;
import br.com.alura.modelos.MinhasPreferidas;
import br.com.alura.modelos.Musica;
import br.com.alura.modelos.Podcast;

public class Principal {
    public static void main(String[]args){
        Musica objMusica = new Musica();

        objMusica.setTitulo("Everything She Wants");
        objMusica.setArtista("Wham");

        for (int i = 0; i < 1000; i++) {
            objMusica.curte();
        }

        for (int j = 0; j < 500; j++) {
            objMusica.reproduzir();
        }

        System.out.println("Título: " + objMusica.getTitulo() + " by " + objMusica.getArtista());
        System.out.println("Total de visualizações: " + objMusica.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + objMusica.getTotalCurtidas());
        System.out.println();

        Podcast objPodcast = new Podcast();

        objPodcast.setTitulo("#345 Conversa com Funkyblackcat");
        objPodcast.setHost("Igor 3k");

        for (int i = 0; i < 2000; i++) {
            objPodcast.curte();
        }

        for (int j = 0; j < 1500; j++) {
            objPodcast.reproduzir();
        }

        System.out.println("Título: " + objPodcast.getTitulo() + " by " + objPodcast.getHost());
        System.out.println("Total de visualizações: " + objPodcast.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + objPodcast.getTotalCurtidas());

        MinhasPreferidas objPreferidas = new MinhasPreferidas();

        objPreferidas.inlcui(objPodcast);
        objPreferidas.inlcui(objMusica);
    }
}
