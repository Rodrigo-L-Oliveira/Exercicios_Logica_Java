package manzanoPag50;

import java.util.Scanner;

public class ExercicioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float largura = 0;
		float comprimento = 0;
		float areaTotal = 0;
		float guardaNumero = 0;
		int contadora = 0;
		String nomeC, resposta;

		do {

			if (contadora == 1) {

			} else {

				System.out.println("Calculando a �rea total de um comodo");

				System.out.println("Digite o nome do Comodo:");
				nomeC = sc.next();
				System.out.println("Digite a largura do Comodo:");
				largura = sc.nextFloat();
				System.out.println("Digite o comprimento do Comodo:");
				comprimento = sc.nextFloat();

				areaTotal = largura * comprimento;
				guardaNumero = guardaNumero + areaTotal;
				System.out.println("A �rea total do(a) " + nomeC + " �: " + areaTotal);

				System.out.println("Deseja continuar descobrindo as areas dos comodos ?");
				resposta = sc.next();

				if ((resposta.equals("n�o")) || (resposta.equals("nao")) || (resposta.equals("NAO")) || (resposta.equals("N�O"))) {
					contadora = contadora + 1;
					System.out.println("O total da �rea da residencia �: " + guardaNumero);
				}
			}

		} while (contadora != 1);

		sc.close();

	}

}
