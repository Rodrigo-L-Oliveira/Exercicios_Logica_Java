package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome, sexo;

		System.out.println("Digite seu nome:");
		nome = sc.next();
		System.out.println("Digite seu sexo(m ou f):");
		sexo = sc.next();

		if (sexo.equals("m")) {
			System.out.println("Ilmo Sr " + nome + " de sexo " + sexo);
		} else if (sexo.equals("f")) {
			System.out.println("Ilmo Sra " + nome + " de sexo " + sexo);
		} else {
			System.out.println("letra digitada n�o correspondente a nenhum sexo(m ou f)");
		}

		sc.close();
	}
}
