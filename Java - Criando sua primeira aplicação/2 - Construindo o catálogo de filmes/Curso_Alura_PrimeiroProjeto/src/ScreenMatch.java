public class ScreenMatch {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        Double notaDoFilme = 8.1;
        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        String sinopse2 = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                """ + anoDeLancamento;

        System.out.println(sinopse2);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}
