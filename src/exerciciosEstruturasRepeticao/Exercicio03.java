package exerciciosEstruturasRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int somaPositivo = 0;

		
		do {
		    System.out.println("Digite um número: ");
		    numero = leia.nextInt();
		    
			if (numero > 0) 
				somaPositivo += numero;
			}while (numero != 0);
	
		System.out.println("A soma dos números positivos é: " + somaPositivo);
		
	leia.close();
}
	
}
