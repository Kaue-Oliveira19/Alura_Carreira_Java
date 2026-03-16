public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "La La Land";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 128;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliaçoes);
        System.out.println(meuFilme.totalDeAvaliaçoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
