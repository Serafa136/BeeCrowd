import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int Cod0 = scanner.nextInt();
        int Prec0 = scanner.nextInt();
        double Val0 = scanner.nextDouble();
        int Cod1 = scanner.nextInt();
        int Prec1 = scanner.nextInt();
        double Val1 = scanner.nextDouble();
        double total = ((Prec0 * Val0) + (Prec1 * Val1));
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
 
        scanner.close();
    }
 
}
