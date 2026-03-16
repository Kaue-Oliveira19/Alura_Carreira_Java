/*
    5 - Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
    exiba uma mensagem correspondente.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = scan.nextInt();

        double resultado = num % 2;

        if(resultado == 1){
            System.out.println("Número ímpar!");
        } else{
            System.out.println("Número par!");
        }
    }
}
