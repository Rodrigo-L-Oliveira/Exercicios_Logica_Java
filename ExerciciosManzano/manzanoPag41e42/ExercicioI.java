package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um numero:");
		numero = sc.nextInt();

		if ((numero % 2) == 1) {
			System.out.println("O numero " + numero + " � impar");
		} else {
			System.out.println("O numero " + numero + " � par");
		}

		sc.close();

	}

}
