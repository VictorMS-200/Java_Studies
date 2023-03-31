package Condições.Exemplo05;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = reader.nextInt();

        if (idade < 18) {
            System.out.println("Você é de menor!");
        } 
        if (idade >= 18 && idade < 65) {
            System.out.println("Você é de maior!");
        } else {
            System.out.println("Maior que 65 anos!");
        }
        
        reader.close();
    }

}
