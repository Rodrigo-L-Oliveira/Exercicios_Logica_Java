package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1, valor2, valor3, valor4, valor5;

		System.out.println("Digite o primeiro valor:");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		valor3 = sc.nextInt();
		System.out.println("Digite o quarto valor:");
		valor4 = sc.nextInt();
		System.out.println("Digite o quinto valor:");
		valor5 = sc.nextInt();

		if ((valor1 > valor2) && (valor1 > valor3) && (valor1 > valor4) && (valor1 > valor5)) {
			System.out.println("O numero " + valor1 + " � o maior valor");
		} else if ((valor2 > valor1) && (valor2 > valor3) && (valor2 > valor4) && (valor2 > valor5)) {
			System.out.println("O numero " + valor2 + " � o maior valor");
		} else if ((valor3 > valor1) && (valor3 > valor2) && (valor3 > valor4) && (valor3 > valor5)) {
			System.out.println("O numero " + valor3 + " � o maior valor");
		} else if ((valor4 > valor1) && (valor4 > valor3) && (valor4 > valor2) && (valor4 > valor5)) {
			System.out.println("O numero " + valor4 + " � o maior valor");
		} else if ((valor5 > valor1) && (valor5 > valor3) && (valor5 > valor4) && (valor5 > valor2)) {
			System.out.println("O numero " + valor5 + " � o maior valor");
		}

		if ((valor1 < valor2) && (valor1 < valor3) && (valor1 < valor4) && (valor1 < valor5)) {
			System.out.println("O numero " + valor1 + " � o menor valor");
		} else if ((valor2 < valor1) && (valor2 < valor3) && (valor2 < valor4) && (valor2 < valor5)) {
			System.out.println("O numero " + valor2 + " � o menor valor");
		} else if ((valor3 < valor1) && (valor3 < valor2) && (valor3 < valor4) && (valor3 < valor5)) {
			System.out.println("O numero " + valor3 + " � o menor valor");
		} else if ((valor4 < valor1) && (valor4 < valor3) && (valor4 < valor2) && (valor4 < valor5)) {
			System.out.println("O numero " + valor4 + " � o menor valor");
		} else if ((valor5 < valor1) && (valor5 < valor3) && (valor5 < valor4) && (valor5 < valor2)) {
			System.out.println("O numero " + valor5 + " � o menor valor");
		}

		sc.close();

	}

}
