import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("La La Land");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(128);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliaçoes = 10;
        //meuFilme.totalDeAvaliaçoes = 1;

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Um lugar chamado Notting Hill");
        meuFilme2.setAnoDeLancamento(1999);
        meuFilme2.setDuracaoEmMinutos(124);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporadas(10);
        lost.setminutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println("Duração total:" + calculadora.getTempoTotal());

    }
}
