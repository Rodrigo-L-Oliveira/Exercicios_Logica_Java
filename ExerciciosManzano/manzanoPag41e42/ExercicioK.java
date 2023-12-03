package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioK {
	public static void main (String []arg) {
	Scanner sc = new Scanner(System.in);

	int valor;

	System.out.println("Digite um valor:");
	valor = sc.nextInt();
	
	if (valor < 3) {
		System.out.println("O valor "+valor+" � menor que 3");
	} else if (valor == 3) {
		System.out.println("O valor "+valor+" � igual 3");
	} else {
		System.out.println("O valor "+valor+" � maior que 3");
	}
	
	
	sc.close();
	
	}

}
