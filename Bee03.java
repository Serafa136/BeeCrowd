import java.util.Scanner;
public class Bee03{
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        double pi = 3.14159;
        double entrada1 = entrada.nextDouble();
        System.out.printf("A=%.4f%n" , (pi *(entrada1 * entrada1)) );

        entrada.close();
    }
}