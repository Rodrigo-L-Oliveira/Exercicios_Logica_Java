package manzanoPag46;

import java.util.Scanner;

public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, contadora = 0, resultado, valorTabuada = 0;

		System.out.println("Digite o valor que voc� quer saber a tabuada(de 1 a 10)");
		numero = sc.nextInt();

		while (contadora < 10) {
			contadora = contadora + 1;
			valorTabuada = valorTabuada + 1;
			resultado = numero * valorTabuada;
			System.out.println("O valor de " + numero + " multiplicado por " + valorTabuada + " �: " + resultado);
		}

		sc.close();

	}

}
