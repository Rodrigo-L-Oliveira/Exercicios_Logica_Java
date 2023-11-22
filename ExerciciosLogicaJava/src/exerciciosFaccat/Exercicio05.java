package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário mensal atual do funcionário:");
		double salarioAtual = sc.nextDouble();

		System.out.println("Digite o percentual de reajuste:");
		double percentualReajuste = sc.nextDouble();

		double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

		System.out.println("O valor do novo salário é: " + novoSalario);
		sc.close();
	}
}

