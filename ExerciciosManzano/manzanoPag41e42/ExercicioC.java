package manzanoPag41e42;

import java.util.Scanner;

public class ExercicioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String aluno, materia1, materia2, materia3, materia4;
		int nota1, nota2, nota3, nota4;
		float media;

		System.out.println("Digite o nome do aluno: ");
		aluno = sc.next();

		System.out.println("Digite o nome da primeira materia:");
		materia1 = sc.next();
		System.out.println("Digite o nome da segunda materia:");
		materia2 = sc.next();
		System.out.println("Digite o nome da terceira materia:");
		materia3 = sc.next();
		System.out.println("Digite o nome da quarta materia:");
		materia4 = sc.next();

		System.out.println("Digite o valor da nota de " + materia1 + " referente ao aluno " + aluno);
		nota1 = sc.nextInt();
		System.out.println("Digite o valor da nota de " + materia2 + " referente ao aluno " + aluno);
		nota2 = sc.nextInt();
		System.out.println("Digite o valor da nota de " + materia3 + " referente ao aluno " + aluno);
		nota3 = sc.nextInt();
		System.out.println("Digite o valor da nota de " + materia4 + " referente ao aluno " + aluno);
		nota4 = sc.nextInt();

		if (nota1 >= 5) {
			System.out.println("nota do aluno " + aluno + " �: " + nota1 + " na mat�ria " + materia1 + " --- Aprovado");
		} else {
			System.out
					.println("nota do aluno " + aluno + " �: " + nota1 + " na mat�ria " + materia1 + " --- Reprovado");
		}

		if (nota2 >= 5) {
			System.out.println("nota do aluno " + aluno + " �: " + nota2 + " na mat�ria " + materia2 + " --- Aprovado");
		} else {
			System.out
					.println("nota do aluno " + aluno + " �: " + nota2 + " na mat�ria " + materia2 + " --- Reprovado");
		}
		if (nota3 >= 5) {
			System.out.println("nota do aluno " + aluno + " �: " + nota3 + " na mat�ria " + materia3 + " --- Aprovado");
		} else {
			System.out
					.println("nota do aluno " + aluno + " �: " + nota3 + " na mat�ria " + materia3 + " --- Reprovado");
		}

		if (nota4 >= 5) {
			System.out.println("nota do aluno " + aluno + " �: " + nota4 + " na mat�ria " + materia4 + " --- Aprovado");
		} else {
			System.out
					.println("nota do aluno " + aluno + " �: " + nota4 + " na mat�ria " + materia4 + " --- Reprovado");
		}

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("O valor da m�dia do " + aluno + " �: " + media);
		System.out.println("O valor da m�dia do aluno para ser aprovado � 5");
		if (media >= 5) {
			System.out.println("aluno Aprovado");
		} else {
			System.out.println("aluno Reprovado");
		}

		sc.close();

	}

}
