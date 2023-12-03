package manzanoPag46;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		float mediaAritmetica = 0;
		int contadora = 50;

		while (contadora < 71) {

			if ((contadora % 2) == 0) {
				System.out.println("O numero " + contadora + " � par");
				soma = soma + contadora;
			}
			contadora = contadora + 1;
		}

		mediaAritmetica = soma / 11;

		System.out.println("A soma dos numeros pares entre 50 at� 70 �: " + soma);
		System.out.println("A m�dia Aritm�tica �: " + mediaAritmetica);

		sc.close();

	}

}
