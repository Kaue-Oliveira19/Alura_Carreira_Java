import java.awt.*;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite a sua avaliação para o filme de o a 10:");
        float notaAvaliacao = leitura.nextFloat();

        System.out.println("Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota de avaliação: " + notaAvaliacao);

        leitura.close();
    }
}
