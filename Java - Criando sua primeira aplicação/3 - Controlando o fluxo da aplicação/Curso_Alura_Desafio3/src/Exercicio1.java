/*
    1 - Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
    caso contrário, exiba "Número negativo".
 */

import java.util.Scanner;

public class Exercicio1  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double num = scan.nextInt();

        if(num == 0){
            System.out.println("Número neutro!");
        } else if(num > 0){
            System.out.println("Número positivo!");
        } else{
            System.out.println("Número negativo!");
        }
    }
}
