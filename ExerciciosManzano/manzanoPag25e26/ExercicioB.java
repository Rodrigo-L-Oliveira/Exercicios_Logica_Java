package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int grauFahrenheit = 0, grauCelsius = 0;

		System.out.println("Digite a temperatura do grau em Fahrenheit para converter em Celsius:");
		grauFahrenheit = sc.nextInt();

		grauCelsius = (grauFahrenheit - 32) * 5 / 9;
		System.out.println("O valor da convers�o de graus Fahrenheit para graus Celsius �: " + grauCelsius);

		sc.close();

	}

}
