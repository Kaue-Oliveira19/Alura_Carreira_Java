import java.util.Scanner;

public class Exercicio3_Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Exercicio3_Produto objProduto = new Exercicio3_Produto();

        System.out.println("Digite o nome do produto:");
        objProduto.setNome(scan.nextLine());

        System.out.println("Digite o valor do produto:");
        objProduto.setPreco(scan.nextDouble());

        System.out.println("Digite o percentual de desconto:");
        objProduto.aplicarDesconto(scan.nextDouble());

        System.out.println(objProduto.getNome());
        System.out.println(objProduto.getPreco());
    }
}
