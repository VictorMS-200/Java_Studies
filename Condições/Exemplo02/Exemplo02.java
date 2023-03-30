package Condições.Exemplo02;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = reader.nextInt();

        if (num >= 20) {
            System.out.println("Número maior ou igual que 20. " + num);
        } else {
            System.out.println("Número menor que 20. " + num);
        }

        reader.close();
    }

}
