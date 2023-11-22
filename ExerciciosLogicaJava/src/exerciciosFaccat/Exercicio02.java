package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base o retangulo");
		int base = sc.nextInt();
		
		System.out.println("Digite a altura o retangulo");
		int altura = sc.nextInt();
		
		System.out.println("A área do retangulo é de: " + base*altura);
		sc.close();
	}
}
