package exerciciosEstruturasRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		int idadeMaior = 0;
		int idadeMenor = 0;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {

			if (idade < 21) {
				idadeMenor++;

			}
			if (idade > 50) {
				idadeMaior++;
			}

			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

		}
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);
		leia.close();

	}
}
