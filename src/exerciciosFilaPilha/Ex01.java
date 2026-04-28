package exerciciosFilaPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = 0;

		do {
			System.out.println("**********************************************************");
			System.out.println(
					"1 - Adicionar Cliente na Fila \n2 - Listar todos os clientes\n3 - Retirar cliente da fila\n0 - Sair ");
			System.out.println("**********************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = leitor.nextInt();
			leitor.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				String nomeCliente = leitor.nextLine();
				fila.add(nomeCliente);
				System.out.println("Cliente adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("O cliente " + fila.poll() + " foi chamado!");
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