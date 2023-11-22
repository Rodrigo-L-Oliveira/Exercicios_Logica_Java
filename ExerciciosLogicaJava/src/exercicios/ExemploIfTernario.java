package exercicios;

import java.util.Scanner;

public class ExemploIfTernario {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		String mensagem = (numero < 10) ? "O número digitado é menor que 10" : "O número digitado é maior que 10";
		System.out.println(mensagem);
	}
}
