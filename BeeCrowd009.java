import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        String funcionario = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double saltotal = ((vendas * 0.15 ) + salario);
        
        System.out.printf("TOTAL = R$ %.2f\n" , saltotal);
 
        scanner.close();
    }
 
}
