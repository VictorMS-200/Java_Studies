package Condições.Exemplo04;
import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = reader.nextInt();

        if (num > 0) {
            double raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada: " + raiz);
        } else {
            double pot = Math.pow(num, 2);
            System.out.println("Quadrado: " + pot);
        }

        reader.close();

    }
    
}
