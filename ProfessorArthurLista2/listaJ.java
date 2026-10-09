package ProfessorArthurLista2;

import java.util.Scanner;

public class listaJ {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
         int numero = scanner.nextInt();

        int contador = numero;

        while (contador >= 0) {
            
            System.out.println(contador);
            contador--;
        }

        System.out.println("LANÇAMENTO!");

        scanner.close();
    }
}
