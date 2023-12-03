package ExerciciosManzano.manzanoPag66;

import java.util.Scanner;

public class ExercicioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int potencia = 0;
		int expoente = 0;
		float soma = 0;
		int contadora;
		/* resultado, soma: real */

		System.out.println("Digite o valor da potencia:");
		potencia = sc.nextInt();
		System.out.println("Digite o valor do expoente:");
		expoente = sc.nextInt();
		
		sc.close();

		soma = potencia;

		for (contadora = 0; contadora < (expoente - 1); contadora++) {
			soma = soma * potencia;
		}

		System.out.println("O resultado da potencia " + potencia + " com o expoente " + expoente + " �: " + soma);

		

	}

}
