package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int volume, comprimento, largura, altura;

		System.out.println("Informe o comprimento da caixa:");
		comprimento = sc.nextInt();
		System.out.println("Informe a largura da caixa:");
		largura = sc.nextInt();
		System.out.println("Informe a altura da caixa:");
		altura = sc.nextInt();

		volume = comprimento * largura * altura;
		System.out.println("O volume da caixa �: " + volume);

		sc.close();

	}

}
