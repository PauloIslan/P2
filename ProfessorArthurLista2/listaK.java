package ProfessorArthurLista2;

import java.util.Scanner;
import java.util.Locale;

public class listaK {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        while (nota < 0.0 || nota > 10.0) {
            System.out.println("Nota invalida, Tente novamente. ");
             nota = scanner.nextDouble();
        }

        if (nota >= 7.0) {
            System.out.println("Aprovado.");
        } else if (nota > 4.0 && nota < 6.9) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
