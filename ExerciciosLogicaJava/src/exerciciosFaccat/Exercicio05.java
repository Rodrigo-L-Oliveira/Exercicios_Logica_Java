package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o sal�rio mensal atual do funcion�rio:");
		double salarioAtual = sc.nextDouble();

		System.out.println("Digite o percentual de reajuste:");
		double percentualReajuste = sc.nextDouble();

		double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

		System.out.println("O valor do novo sal�rio �: " + novoSalario);
		sc.close();
	}
}

