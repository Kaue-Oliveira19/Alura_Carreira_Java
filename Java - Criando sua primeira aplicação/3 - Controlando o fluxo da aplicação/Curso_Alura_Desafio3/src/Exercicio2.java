/*
    2 - Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
    iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 == num2){
            System.out.println("São números iguais!");
        } else if(num1 != num2 && num1 > num2){
            System.out.println("São números diferentes e " + num1 + " é maior do que " + num2);
        } else{
            System.out.println("São números diferentes e " + num2 + " é maior do que " + num1);
        }
    }
}
