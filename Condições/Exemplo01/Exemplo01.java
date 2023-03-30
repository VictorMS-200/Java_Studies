
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        // Criando o objeto reader para ler o número digitado pelo usúario
        Scanner reader = new Scanner(System.in);

        // Número digitado pelo usúario é aguardado na variavel num1
        System.out.println("Digite um número: ");
        int num = (int) reader.nextInt();

        // Número digitado pelo usúario é aguardado na variavel num2
        System.out.println("Digite outro número: ");
        int num2 = (int) reader.nextInt();


        // É mostrado o dividendo, divisor, quociente e o restos da operaçãa feita com os números digitados
        System.out.printf("O dividendo dos valores é: %d\n", num);
        System.out.printf("O divisor dos valores é: %d\n", num2);
        System.out.printf("O quociente dos valores é: %d\n", num/num2);
        System.out.printf("O resto dos valores é: %d\n", num%num2);

        // Fecha o objeto reader
        reader.close();
        
    }
}