package exercicios;

import java.util.Scanner;

public class ExemploIfTernario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		String mensagem = (numero < 10) ? "O n�mero digitado � menor que 10" : "O n�mero digitado � maior que 10";
		System.out.println(mensagem);
	}
}
