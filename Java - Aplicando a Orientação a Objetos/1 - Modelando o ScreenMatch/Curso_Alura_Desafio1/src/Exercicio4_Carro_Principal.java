public class Exercicio4_Carro_Principal {
    public static void main(String[] args) {
        System.out.println("Exercício 4");

        Exercicio4_Carro objTeste4 = new Exercicio4_Carro();

        objTeste4.modelo = "Fiat Mobi";
        objTeste4.ano = 2017;
        objTeste4.cor = "Vermelho Torino";
        objTeste4.exibaFichaTecnica();

        System.out.println("Idade do carro: " + objTeste4.retornaIdadeCarro());
    }
}
