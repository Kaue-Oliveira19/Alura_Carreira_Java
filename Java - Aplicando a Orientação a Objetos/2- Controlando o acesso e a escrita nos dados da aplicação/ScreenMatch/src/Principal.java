import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("La La Land");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(128);

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliaçoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliaçoes = 10;
        //meuFilme.totalDeAvaliaçoes = 1;
    }
}
