public class Main {
    public static void main(String[] args){
        double temperatura = 23;
        double fahrenheit1 = (temperatura * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit1 + "ºF");
        String texto1 = (String.format("Temperatura em Fahrenheit: %.2fºF", fahrenheit1));

        System.out.println(texto1);

        String texto2 = """
                Temperatura em Fahrenheit: %.2f °F
                """.formatted(fahrenheit1);

        System.out.println(texto2);

        int fahrenheit2 = (int) fahrenheit1;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit2 + "°F");
    }
}