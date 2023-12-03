package ExerciciosManzano.manzanoPag66;

public class ExercicioK {

	public static void main(String[] args) {


		int antecessor = 0;
		int resultado = 0;
		int fatorial = 0;
		int guardaValor = 0;
		int contadora = 1;

		for (contadora = 1; contadora <= 10; contadora++) {
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
		}

		System.out.println("A soma do fatorial de todos os numeros digitado � " + guardaValor);

	}

}
