package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;

		System.out.println("Digite um numero:");
		valor = sc.nextInt();

		if (valor < 0) {
			valor = valor * (-1);
			System.out.println("O valor �: " + valor);
		} else {
			System.out.println("O valor �: " + valor);
		}

		sc.close();

	}

}
