import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float totalNotas = 0;
        float notaAvaliacao = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a sua avaliação para o filme de o a 10:");
            notaAvaliacao = leitura.nextFloat();
            totalNotas += notaAvaliacao;
        }

        System.out.println(String.format("Média das notas: %.2f", totalNotas / 3));

        leitura.close();
    }
}
