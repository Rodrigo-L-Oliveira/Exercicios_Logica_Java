package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1, numero2, resultado;

		System.out.println("Digite o primeiro n�mero:");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero:");
		numero2 = sc.nextInt();

		if (numero1 >= numero2) {
			resultado = numero1 - numero2;
			System.out.println("A diferen�a dos dois valores �: " + resultado);
		} else {
			resultado = numero2 - numero1;
			System.out.println("A diferen�a dos dois valores �: " + resultado);
		}

		sc.close();

	}

}
