package exerciciosCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		System.out.println("Digite 10 números: ");

		for (int i = 0; i < 10; i++) {
			Integer numerosDigitado = leitor.nextInt();
			numeros.add(numerosDigitado);
		}

		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> inumeros = numeros.iterator();

		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());

		}
		leitor.close();
	}
}
