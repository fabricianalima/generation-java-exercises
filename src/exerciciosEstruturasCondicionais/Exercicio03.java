package exerciciosEstruturasCondicionais;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int preco = 0;
		String produto = "";
		
		System.out.println("Digite o código do produto");
		int codigoProduto = leitor.nextInt();

		System.out.println("Digite a quantidade do produto");
		int qtdeProduto = leitor.nextInt();

		switch (codigoProduto) {
		case 1:
			preco = 10;
			produto = "Cachorro Quente";
			break;
		case 2:
			preco = 15;
			produto = "X-Salada";
			break;
		case 3:
			preco = 18;
			produto = "X-Bacon";
			break;
		case 4:
			preco = 12;
			produto = "Bauru";
			break;
		case 5:
			preco = 8;
			produto = "Refrigerante";
			break;
		case 6:
			preco = 13;
			produto = "Suco de Laranja";
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		int valorTotal = preco * qtdeProduto;
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor total: " + "R$ " + valorTotal);
		
		leitor.close();
	}
}
	
		
