package manzanoPag50;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0, menor = 0, maior = 0, contador = 0;

		System.out.println("Insira os valores inteiros. Caso o valor inserido seja negativo, o programa para.");
		System.out.println("Insira o valor: ");
		n = sc.nextInt();

		do {
			if (contador == 0) {
				maior = n;
				menor = n;

			} else {

				if (n > maior) {
					maior = n;
				}

				if (n < menor) {
					menor = n;

				}
			}

			contador = contador + 1;
			System.out.println("Insira o valor: ");
			n = sc.nextInt();

		} while (n > 0);
		System.out.println("O menor valor informado �:" + menor + ". O maior valor informado �:" + maior);

		sc.close();

	}

}
