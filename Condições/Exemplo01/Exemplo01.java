package Condições.Exemplo01;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = (int) reader.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = (int) reader.nextInt();

        System.out.printf("O dividendo dos valores é: %d\n", num);
        System.out.printf("O divisor dos valores é: %d\n", num2);
        System.out.printf("O quociente dos valores é: %d\n", num/num2);
        System.out.printf("O resto dos valores é: %d\n", num%num2);
        reader.close();
        
    }
}