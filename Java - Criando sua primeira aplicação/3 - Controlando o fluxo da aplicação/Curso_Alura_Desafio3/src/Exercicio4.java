/*
    4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você gostaria de saber?");
        int num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            int tabuada = num * i;
            System.out.println(String.format("%d X %d = %d", num, i, tabuada));
        }
    }
}
