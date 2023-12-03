package manzanoPag46;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1 = 0;
		int soma = 0;
		float mediaAritmetica = 0;
		int contadora = 0;

		while (contadora < 10) {
			contadora = contadora + 1;
			System.out.println("Digite o " + contadora + " valor:");
			valor1 = sc.nextInt();
			soma = soma + valor1;
		}

		mediaAritmetica = soma / 10;

		System.out.println("A soma de todos valores �: " + soma);
		System.out.println("A m�dia Aritm�tica dos n�meros �: " + mediaAritmetica);

		sc.close();

	}

}
