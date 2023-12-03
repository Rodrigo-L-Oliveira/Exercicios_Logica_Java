package manzanoPag50;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dendo = 0, sor = 0, quo = 0, rest = 0;

				System.out.println("insira o dividendo: ");
				dendo = sc.nextInt();
				System.out.println("insira o divisor: ");
				sor = sc.nextInt();
				

				if (sor == 0) {
					System.out.println("Divis�o indeterminada");

				} else {
				    if (dendo == 0) {
				    	System.out.println("Divis�o igual a: 0");

				    } else {
				        rest = dendo;
				        do {
				            rest = rest - sor;
				            quo = quo + 1;

				        } while (rest >= sor);
				        	System.out.println("O resultado da divis�o de: " + dendo + " por " + sor + " equivale a: " + quo + " com resto igual a " + rest);
				    }
				}
		
		sc.close();

	}

}
