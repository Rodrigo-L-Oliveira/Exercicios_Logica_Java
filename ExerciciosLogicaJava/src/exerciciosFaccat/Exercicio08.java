package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus Fahrenheit:");
		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * (5 / 9);

		System.out.println("A temperatura em graus Celsius é: " + celsius);
		sc.close();
	}
}
