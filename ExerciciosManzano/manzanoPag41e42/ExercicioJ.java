package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um numero:");
		numero = sc.nextInt();

		if (numero >= 1 && numero <= 9) {
			System.out.println("O valor est� na faixa permitida");
		} else {
			System.out.println("O valor n�o est� na faixa permitida");
		}

		sc.close();

	}

}
