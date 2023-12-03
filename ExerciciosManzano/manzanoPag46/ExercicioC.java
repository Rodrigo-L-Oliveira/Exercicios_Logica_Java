package manzanoPag46;

import java.util.Scanner;

public class ExercicioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroPar = 2;
		int resultado = 2;
		int contadora = 2;
		int numero2 = 0;

		while (contadora < 500) {

			resultado = resultado + 2;
			numero2 = numeroPar + resultado;
			numeroPar = numero2;

			contadora = contadora + 2;
		}

		System.out.println("A somatoria dos valores pares at� 500 �: " + numeroPar);

		sc.close();

	}

}
