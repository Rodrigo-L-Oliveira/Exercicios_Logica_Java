package manzanoPag46;

import java.util.Scanner;

public class ExercicioK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeC, resposta;
		float areaTotal = 0;
		float guardaNumero = 0;
		float contadora = 0;
		float largura, comprimento;

		while (contadora < 1) {
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

			if (resposta.equals("n�o")) {
				contadora = contadora + 1;
				System.out.println("O total da �rea da residencia �: " + guardaNumero);
			}

		}

		sc.close();

	}

}
