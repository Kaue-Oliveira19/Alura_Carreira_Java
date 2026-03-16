import java.util.Scanner;

public class Exercicio2_Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Exercicio2_IdadePessoa objPessoa = new Exercicio2_IdadePessoa();

        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();
        objPessoa.setNome(nome);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        objPessoa.setIdade(idade);

        objPessoa.verificarIdade();
    }
}
