package exerciciosOperadores;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;

		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();

		System.out.println("Digite os descontos: ");
		descontos = leia.nextFloat();

		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("O salário líquido é: %.1f", salarioLiquido);

		leia.close();
	}

}
