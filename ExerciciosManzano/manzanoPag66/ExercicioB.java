package ExerciciosManzano.manzanoPag66;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		float multiplicacao;

		System.out.println("Insira o numero para gerar a tabuada: ");
		numero = sc.nextInt();

		System.out.println("Segue a tabuada:");
		for (var contadora = 1; contadora < 11; contadora++) {
			multiplicacao = contadora * numero;
			System.out.println(numero + " x " + contadora + " = " + multiplicacao);
		}

		sc.close();

	}

}
