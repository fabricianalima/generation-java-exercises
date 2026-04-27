package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			String nomeCor = leitor.nextLine();
			cores.add(nomeCor);
		}
		System.out.println("Lista das cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("Lista das cores ordenadas: ");
		cores.sort(null);
		
		for (String cor : cores) {
			System.out.println(cor);
		}
		leitor.close();
	}

}
