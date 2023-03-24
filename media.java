import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        int[] num = {0, 0, 0, 0};
        int Total = 0; 
        Scanner reader = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("numero:");
            num[i] = reader.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            Total += num[i];
        }
        System.out.println(Total/4);
    }
}
