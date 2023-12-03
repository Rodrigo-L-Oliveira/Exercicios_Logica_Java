package manzanoPag25e26;

import java.util.Scanner;

import java.lang.Math;

public class ExercicioL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, soma;

		System.out.println("digite o valor de A ");
		valorA = sc.nextInt();
		System.out.println("digite o valor de B ");
		valorB = sc.nextInt();
		System.out.println("digite o valor de C");
		valorC = sc.nextInt();

		soma = (int) Math.pow(valorA, 2) + (int) Math.pow(valorB, 2) + (int) Math.pow(valorC, 2);

		System.out.println("ValorA: " + valorA);
		System.out.println("ValorB " + valorB);
		System.out.println("ValorC: " + valorC);
		System.out.println("A soma dos valores de A, B e C ao quadrado �: " + soma);

		sc.close();

	}

}
