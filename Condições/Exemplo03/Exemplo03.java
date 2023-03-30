import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        // Criando o objeto reader para ler o número digitado pelo usúario
        Scanner reader = new Scanner(System.in);

        // Número digitado pelo usúario é aguardado na variavel num1
        System.out.println("Digite um número: ");
        int num1 = reader.nextInt();

        // Número digitado pelo usúario é aguardado na variavel num
        System.out.println("Digite outro número: ");
        int num2 = reader.nextInt();

        // Verifica se a soma dos números digitado é maior ou igual que 10
        if ((num1+num2) >= 10) {
            System.out.println("A soma dos números " + num1 + " + " + num2 + " é " + (num1+num2));
            System.out.println("A soma é maior ou igual que 10.");
        } else {
            System.out.println("A soma dos números " + num1 + num2 + " é " + (num1+num2));
            System.out.println("A soma é menor que 10.");
        }

        // Fecha o objeto reader
        reader.close();
    }
}
