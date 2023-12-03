package ExerciciosManzano.manzanoPag66;

public class ExercicioC {

	public static void main(String[] args) {

		int soma, contadora;

		System.out.println("Soma dos primeiros 100 numeros inteiros (1-100)");
		soma = 0;
		for (contadora = 1; contadora < 101; contadora++) {
			System.out.println(soma + " + " + contadora + " =");
			soma = soma + contadora;
			System.out.println(soma);
		}

	}

}
