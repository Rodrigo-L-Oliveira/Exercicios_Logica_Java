package manzanoPag50;

import java.lang.Math;

public class ExercicioA {

	public static void main(String[] args) {

		int contadora = 15;
		float resultado;

		do {
			resultado = (float) Math.pow(contadora, 2);
			System.out.println("O resultado do quadrado de " + contadora + " � " + resultado);
			contadora = contadora + 1;
		} while (contadora < 201);

	}

}
