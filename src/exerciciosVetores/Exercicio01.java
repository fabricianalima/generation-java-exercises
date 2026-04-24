package exerciciosVetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int numeroBuscado;
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice = -1;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroBuscado = leia.nextInt();

		for (int i = 0; i < 10; i++) {
			
			if (vetorNumeros[i] == numeroBuscado) {
				indice = i;
				break;
			}
		}
		
		if (indice != -1) {
			System.out.println("O número " + numeroBuscado + " está localizado na posição: " + indice);
		} else {
			System.out.println("O número " + numeroBuscado + " não foi encontrado!");

		}
		
		leia.close();
	}

	}
