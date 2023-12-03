package manzanoPag46;

import java.util.Scanner;

public class ExercicioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1 = 1;
		int numero2 = 1;
		int contadora = 3;
		int proximoNumero = 0;

		System.out.println(numero1);
		System.out.println(numero2);

		while (contadora < 16) {
			proximoNumero = numero1 + numero2;
			System.out.println(proximoNumero);
			numero1 = numero2;
			numero2 = proximoNumero;
			contadora = contadora + 1;
		}

		sc.close();

	}

}
