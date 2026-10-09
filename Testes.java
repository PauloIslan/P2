import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        int dobro = numero1 * 2;
        int triplo = numero1 * 3;

        int total = dobro + triplo;

        System.out.print("Total: " + total);

        scanner.close();
    }
}
