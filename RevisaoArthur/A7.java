package RevisaoArthur;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (nota >= 6) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado.");
        }

        scanner.close();
    }
}
