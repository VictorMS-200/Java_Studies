package Variaveis.Exemplo01;
import java.util.Scanner;

public class graus {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        int temperatura = reader.nextInt();

        System.out.printf("Temperatura convertida para Fahrenheit: %d", (9*temperatura + 160)/5 + "°");
        reader.close();
    }
}
