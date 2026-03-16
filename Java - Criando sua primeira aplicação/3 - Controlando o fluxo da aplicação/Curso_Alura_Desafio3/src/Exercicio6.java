/*
    6 - Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Digite um número para o fatorial ser calculado:");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);
    }
}
