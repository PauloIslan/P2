package RevisaoArthur;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String senha = "abacaxi123";
        
        System.out.println("Digite sua senha: ");
        String acesso = scanner.nextLine();

        while (!senha.equals(acesso)) {

            System.out.println("Senha incorreta, Tente novamente. ");
            System.out.println("Digite sua senha: ");
            acesso = scanner.nextLine();

            if (senha.equals(senha)) {
                System.out.println("Acesso Permitido. ");
            }
        }
            scanner.close();
     }
}