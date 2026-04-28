package exerciciosFilaPilha;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
        Deque<String> pilhaLivros = new ArrayDeque<>();
		Scanner leitor = new Scanner(System.in);

        int opcao = 0;

		do {
			System.out.println("**********************************************************");
			System.out.println(
					"1 - Adicionar livro na pilha \n2 - Listar todos os livros\n3 - Retirar livro da pilha\n0 - Sair ");
			System.out.println("**********************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leitor.nextInt();
			leitor.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				String nomeLivro = leitor.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;

			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					pilhaLivros.pop();
					System.out.println("O livro foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);
		leitor.close();
	}

	}


