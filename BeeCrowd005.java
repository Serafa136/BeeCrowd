import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        A = (A * 3.5);
        B = (B * 7.5);
        double MEDIA = ((A + B)/11);
        
        System.out.printf("MEDIA = %.5f\n" , MEDIA);
 
        scanner.close();
    }
 
}
