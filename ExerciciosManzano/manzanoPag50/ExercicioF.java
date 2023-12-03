package manzanoPag50;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float valor = 0;
		float soma = 0;
		float mediaAritmetica = 0;
		int contadora = 1;

		System.out.println("Digite um valor:");
		valor = sc.nextFloat();
		soma = soma + valor;

		do {
			System.out.println("Digite um valor:");
			valor = sc.nextFloat();

			if (valor > 0) {
				soma = soma + valor;
			}
			contadora = contadora + 1;
		} while (valor > 0);

		mediaAritmetica = soma / contadora;

		System.out.println("A soma de todos valores �: " + soma);
		System.out.println("A m�dia Aritm�tica dos n�meros �: " + mediaAritmetica);
		System.out.println("O total de n�meros digitados foram: " + contadora);

		sc.close();

	}

}
