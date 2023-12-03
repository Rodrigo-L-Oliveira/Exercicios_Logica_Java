package manzanoPag25e26;

import java.util.Scanner;


public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int grauCelsius, grauFahrenheit;

		System.out.println("Digite a temperatura em graus celsius");
		grauCelsius = sc.nextInt();

		grauFahrenheit = ((9 * grauCelsius) + 160) / 5;
		System.out.println("temperatura convertida de graus Celsius para Fahrenheit �: " + grauFahrenheit);

		sc.close();

	}

}
