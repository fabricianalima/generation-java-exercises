package exerciciosEstruturasRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int contador;
		int numero = 0;
		int contadorPar = 0;
		int contadorImpar = 0;

		for (contador = 1; contador < 11; contador++) {
			System.out.println("Digite o " + contador + "º numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}

		System.out.println("Total de números pares: " + contadorPar);
		System.out.println("Total de números ímpares: " + contadorImpar);
		leia.close();
	}
}