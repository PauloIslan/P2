package RevisaoArthur;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite sua nota da primeira avaliação: ");
        double avaliacao = scanner.nextDouble();

        System.out.println("Nome: " + aluno);
        System.out.println("Idade: " + idade);        
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + avaliacao);

        scanner.close();
    }
}
