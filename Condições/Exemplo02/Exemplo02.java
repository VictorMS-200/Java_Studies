import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        // Criando o objeto reader para ler o número digitado pelo usúario
        Scanner reader = new Scanner(System.in);

        // Número digitado pelo usúario é aguardado na variavel num
        System.out.println("Digite um número: ");
        int num = reader.nextInt();


        // Verifica se o número digitado é maior ou igual que 20
        if (num >= 20) {
            System.out.println("Número " + num + " é maior ou igual que 20.");
        } else {
            System.out.println("O número " + num + " é menor que 20.");
        }
        
        // Fecha o objeto reader
        reader.close();
    }

}