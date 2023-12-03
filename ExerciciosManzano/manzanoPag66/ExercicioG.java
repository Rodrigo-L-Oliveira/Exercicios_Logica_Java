package ExerciciosManzano.manzanoPag66;

import java.util.Scanner;

public class ExercicioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int numero = 0;
		int exponente = 0;
		int contadora;

		System.out.println("digite um numero");
		numero = sc.nextInt();
		System.out.println("digite o exponente");
		exponente = sc.nextInt();
		
		sc.close();

		for (contadora = 0; contadora <= exponente; contadora++) {

			total = numero * total;
			if (total == 0) {
				total = 1;
			}
			System.out.println("O valor de " + numero + " elevado a " + contadora + " �: " + total);

		}

	}

}
