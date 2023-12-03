package manzanoPag46;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int soma = 0;
		int contadora = 0;
		int potencia;
		int expoente;

		System.out.println("Digite um numero: ");
		potencia = sc.nextInt();
		System.out.println("Digite o numero do expoente");
		expoente = sc.nextInt();

		soma = potencia;
		while (contadora < (expoente - 1)) {
			soma = soma * potencia;
			contadora = contadora + 1;
		}

		System.out.println("O resultado da potencia " + potencia + " com o expoente " + expoente + " �: " + soma);

		sc.close();

	}

}
