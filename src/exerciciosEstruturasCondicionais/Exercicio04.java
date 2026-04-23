package exerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		String nomeColaborador = "";
		String nomeCargo = "";
		int codigoCargo = 0;
		float salario = 0;
		float percentualReajuste = 0;

		System.out.println("Digite o nome do colaborador");
		nomeColaborador = leitor.nextLine();
		System.out.println("Digite o cargo do colaborador");
		codigoCargo = leitor.nextInt();
		System.out.println("Digite o salário do colaborador");
		salario = leitor.nextFloat();
		

		switch (codigoCargo) {
		case 1:
			percentualReajuste = 10;
			nomeCargo = "Gerente";
			break;
		case 2:
			percentualReajuste = 7;
			nomeCargo = "Vendedor";
			break;
		case 3:
			percentualReajuste = 9;
			nomeCargo = "Supervisor";
			break;
		case 4:
			percentualReajuste = 6;
			nomeCargo = "Motorista";
			break;
		case 5:
			percentualReajuste = 5;
			nomeCargo = "Estoquista";
			break;
		case 6:
			percentualReajuste = 8;
			nomeCargo = "Técnico de TI";
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		float novoSalario = salario + (salario * percentualReajuste/ 100);
		
		System.out.println("Nome do colaborador:  " + nomeColaborador);
		System.out.println("Cargo: " + nomeCargo);
		System.out.printf("Salário: R$ %.2f%n", novoSalario);

		
		leitor.close();
}
}