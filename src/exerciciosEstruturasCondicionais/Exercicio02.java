package exerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int numero = leitor.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O Número " + numero + " é par e positivo!");
		} else if (numero % 2 == 0 && numero <= 0) {
			System.out.println("O Número " + numero + " é par e negativo!");
		} else if (numero % 2 != 0 && numero >= 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");
		} else {
			System.out.println("O Número " + numero + " é ímpar e negativo!");
		}
		leitor.close();
	}

}
