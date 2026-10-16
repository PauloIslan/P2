package RevisaoArthur;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Positivo. ");
        } else if (numero < 0) {
            System.out.println("Negativo. ");
        } else {
            System.out.println("Igual a zero. ");
        }

        scanner.close();
    }
}
