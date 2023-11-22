package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero total de eleitores:");
		double totalEleitores = sc.nextDouble();

		System.out.println("Digite o n�mero de votos brancos:");
		double votosBrancos = sc.nextDouble();

		System.out.println("Digite o n�mero de votos nulos:");
		double votosNulos = sc.nextDouble();

		System.out.println("Digite o n�mero de votos v�lidos:");
		double votosValidos = sc.nextDouble();

		double percentualBrancos = (votosBrancos / totalEleitores) * 100;
		double percentualNulos = (votosNulos / totalEleitores) * 100;
		double percentualValidos = (votosValidos / totalEleitores) * 100;

		System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
		System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
		System.out.println("Percentual de votos v�lidos: " + percentualValidos + "%");
		sc.close();
	}
}
