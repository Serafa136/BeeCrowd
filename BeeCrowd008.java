import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int funcionario = scanner.nextInt();
        double horas = scanner.nextDouble();
        double salario = scanner.nextDouble();
        double salres = (horas * salario);
        
        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f\n" , salres);
 
        scanner.close();
    }
 
}
