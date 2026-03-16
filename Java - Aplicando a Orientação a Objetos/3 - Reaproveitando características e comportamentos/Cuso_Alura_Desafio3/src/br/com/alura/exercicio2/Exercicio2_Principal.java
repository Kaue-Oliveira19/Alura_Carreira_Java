package br.com.alura.exercicio2;

/*
    2 - Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam
    da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que
    estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para
    o Cachorro e arranharMoveis() para o Gato.
 */

public class Exercicio2_Principal {
    public static void main(String[] args){
        Exercicio2_Cachorro objDog = new Exercicio2_Cachorro();

        objDog.emitirSom();
        objDog.pegarGraveto();
        objDog.abanarRabo();

        Exercicio2_Gato objGato = new Exercicio2_Gato();

        objGato.emitirSom();
        objGato.arranharDono();
        objGato.arranharMoveis();
    }
}
