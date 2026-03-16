/*
    3 - Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Digite o número correspondente com a opção que você deseja:
                
                1 - Calcular área do quadrado
                
                2 - Calcular área do círculo
                """);
        int opcao = scan.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite o lado do quadrado:");
                int lado = scan.nextInt();

                int areaQuadrado = lado * lado;

                System.out.println("Área do quadrado: " + areaQuadrado);

                break;
            case 2:
                System.out.println("Digite o raio:");
                int raio = scan.nextInt();

                double areaCirculo = 3.14 * Math.pow(raio, 2);

                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
