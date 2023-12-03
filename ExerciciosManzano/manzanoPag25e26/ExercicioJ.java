package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dollar, reais;

		System.out.println("digite o valor de dollares que voc� deseja converter para reais");
		dollar = sc.nextInt();
		reais = dollar / 5;
		System.out.println("Convertendo voc� tem " + reais + " reais");

		sc.close();

	}

}
