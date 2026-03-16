import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numAleatorio = 0;
        int chute = 0;
        //Random random = new Random();
        numAleatorio = new Random().nextInt(100);

        System.out.println("JOGO DA ADIVINHAÇÃO");

        for(int i = 1; i <= 5; i++){
            System.out.println(String.format("Adivinhe o número (Tentativa %d):", i));
            chute = scan.nextInt();
            
            if(chute == numAleatorio){
                System.out.println("Parabéns! O número aleatório era " + numAleatorio);
                break;
            } else if(chute > numAleatorio){
                System.out.println("O número é menor do que " + chute);
            } else{
                System.out.println("O número é maior do que " + chute);
            }
        }

        System.out.println(String.format("""
                Suas tentativas acabaram!
                
                O número aleatório era %d
                """, numAleatorio));
    }
}