package exerciciosVetores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int vetorNumeros[] = new int[10];
		double soma = 0, media = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 números: ");

		for (int i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = leia.nextInt();
			soma += vetorNumeros[i];
			media = soma / 10.0;
		}

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] % 2 == 0) {
				System.out.println("Elementos nos índices pares: " + vetorNumeros[i]);
			}
		}
		for (int i = 0; i < vetorNumeros.length; i++) {

			if (vetorNumeros[i] % 2 != 0) {
				System.out.println("Elementos nos índices ímpares: " + vetorNumeros[i]);

			}
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		leia.close();
	}
}
