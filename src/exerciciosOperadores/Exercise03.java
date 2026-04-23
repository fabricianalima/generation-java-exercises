package exerciciosOperadores;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numero1;
		float numero2;
		float numero3;
		float numero4;

		System.out.print("Digite o número 1: ");
		numero1 = leia.nextFloat();

		System.out.print("Digite o número 2: ");
		numero2 = leia.nextFloat();

		System.out.print("Digite o número 3: ");
		numero3 = leia.nextFloat();

		System.out.print("Digite o número 4: ");
		numero4 = leia.nextFloat();

		float calculoProduto = (numero1 * numero2) - (numero3 * numero4);

		System.out.printf("A média é: %.1f", calculoProduto);
		
		leia.close();
	}

}

