package exerciciosCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numeroDigitado = 0;
		Set<Integer> numeros = new HashSet<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDigitado = leitor.nextInt();
		
		if (numeros.contains(numeroDigitado)) {
			System.out.println("O número  " + numeroDigitado + " foi encontrado!");
		}else {
		System.out.println("O número " + numeroDigitado + " não foi encontrado");
		}
		leitor.close();
	}
}
