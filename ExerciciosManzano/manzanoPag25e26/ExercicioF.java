package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorA, valorB, trocaValoresA, trocaValoresB;

		System.out.println("Digita o valor de A:");
		valorA = sc.nextInt();
		System.out.println("Digita o valor de B:");
		valorB = sc.nextInt();

		trocaValoresA = valorA;
		trocaValoresB = valorB;

		valorA = trocaValoresB;
		valorB = trocaValoresA;

		System.out.println("O valor de A � " + valorA);
		System.out.println("O valor de B � " + valorB);

		sc.close();

	}

}
