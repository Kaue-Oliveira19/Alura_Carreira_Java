import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double totalNotas = 0;
        double notaAvaliacao = 0;
        int i = 0;

        while(notaAvaliacao != -1){
            System.out.println("Digite a nota de sua avaliação para o filme de o a 10 ou -1 para encerrar:");
            notaAvaliacao = leitura.nextFloat();

            if(notaAvaliacao != -1){
                totalNotas += notaAvaliacao;
                i++;
            }
        }

        System.out.println(String.format("Média das notas: %.2f", totalNotas / i));

        leitura.close();
    }
}
