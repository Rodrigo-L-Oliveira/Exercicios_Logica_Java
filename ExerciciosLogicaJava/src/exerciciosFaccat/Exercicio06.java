package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de custo do carro:");
        double custoFabrica = sc.nextDouble();

        double percentualDistribuidor = 28;
        double impostos = 45;

        double custoFinal = custoFabrica + (custoFabrica * percentualDistribuidor / 100) + (custoFabrica * impostos / 100);

        System.out.println("O valor fial do carro é de: " + custoFinal);
        sc.close();
    }
}
