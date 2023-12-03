package manzanoPag50;

public class ExercicioG {

	public static void main(String[] args) {

		int contadora = 0;
		int antecessor = 0; /* inteiro */
		int resultado = 0;
		int fatorial = 0;
		float guardaValor = 0; /* real */

		do {
			contadora = contadora + 1;
			antecessor = contadora;
			fatorial = contadora;

			if ((contadora % 2) == 1) {
				System.out.println("O valor " + contadora + " � impar");

				do {
					antecessor = antecessor - 1;
					fatorial = fatorial * antecessor;
					resultado = fatorial;
					System.out.println(resultado);
				} while (antecessor > 2);

				guardaValor = guardaValor + resultado;
			}

		} while (contadora < 10);

		System.out.println("A soma do fatorial de todos os numeros digitado � " + guardaValor);

	}

}
