package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempo1, velocidade;
		float distancia, litrosUsados;

		System.out.println("Digite o tempo:");
		tempo1 = sc.nextInt();
		System.out.println("Digite a velocidade:");
		velocidade = sc.nextInt();

		distancia = tempo1 * velocidade;
		System.out.println("Tempo:  " + tempo1);
		System.out.println("Velocidade:  " + velocidade);
		System.out.println("Essa � a distancia percorrida " + distancia);
		litrosUsados = distancia / 12;
		System.out.println("Os litros usados foram " + litrosUsados + " litros.");

		sc.close();

	}

}
