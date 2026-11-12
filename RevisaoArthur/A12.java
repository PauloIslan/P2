package RevisaoArthur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class A12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> alunos = new ArrayList<HashMap<String, Object>>();
		int opcao = 0;

		while (opcao != 5) {
			System.out.println("===== MENU =====");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Listar alunos");
			System.out.println("3 - Remover aluno");
			System.out.println("4 - Limpar lista");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				HashMap<String, Object> aluno = new HashMap<String, Object>();
				System.out.print("Nome: ");
				aluno.put("nome", scanner.nextLine());
				System.out.print("Idade: ");
				aluno.put("idade", scanner.nextInt());
				System.out.print("Nota: ");
				aluno.put("nota", scanner.nextDouble());
				scanner.nextLine();
				alunos.add(aluno);
				System.out.println("Aluno cadastrado com sucesso!");
			} else if (opcao == 2) {
				if (alunos.size() == 0) {
					System.out.println("Nenhum aluno cadastrado.");
				} else {
					for (HashMap<String, Object> aluno : alunos) {
						System.out.println("Nome: " + aluno.get("nome"));
						System.out.println("Idade: " + aluno.get("idade"));
						System.out.println("Nota: " + aluno.get("nota"));
					}
				}
			} else if (opcao == 3) {
				System.out.print("Nome do aluno a remover: ");
				String nome = scanner.nextLine();
				boolean removido = false;
				for (int i = 0; i < alunos.size(); i++) {
					if (alunos.get(i).get("nome").toString().equals(nome)) {
						alunos.remove(i);
						removido = true;
						break;
					}
				}
				if (removido) {
					System.out.println("Aluno removido com sucesso!");
				} else {
					System.out.println("Aluno não encontrado.");
				}
			} else if (opcao == 4) {
				alunos.clear();
				System.out.println("Lista limpa com sucesso!");
			} else if (opcao == 5) {
				System.out.println("Programa encerrado.");
			} else {
				System.out.println("Opção inválida.");
			}
		}
		scanner.close();
	}
}
