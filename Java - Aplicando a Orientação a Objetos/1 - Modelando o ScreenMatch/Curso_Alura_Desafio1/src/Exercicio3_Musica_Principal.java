public class Exercicio3_Musica_Principal {
    public static void main(String[] args) {
        System.out.println("Exercício 3");

        Exercicio3_Musica objTeste3 = new Exercicio3_Musica();

        objTeste3.titulo = "The Perfect Kiss";
        objTeste3.artista = "New Order";
        objTeste3.anoLancamento = 1985;
        objTeste3.avaliaMusica(10);
        objTeste3.avaliaMusica(9);
        objTeste3.exibaFichaTecnica();

        System.out.println("Média das avaliações: " + objTeste3.calculaMediaAvaliaçoes());
    }
}
