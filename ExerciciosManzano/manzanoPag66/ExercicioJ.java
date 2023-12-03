package ExerciciosManzano.manzanoPag66;

public class ExercicioJ {

	public static void main(String[] args) {

		int grauF = 0;
		int grauC;

		for (grauC = 10; grauC <= 100; grauC = grauC + 10) {

			grauF = ((9 * grauC) + 160) / 5;
			System.out.println("O valor de " + grauC + " graus Celsius convertido em graus Fahrenhei �: " + grauF);

		}

	}

}
