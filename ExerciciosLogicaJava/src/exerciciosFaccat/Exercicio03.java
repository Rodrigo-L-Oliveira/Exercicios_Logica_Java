package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade em anos: ");
        int anos = sc.nextInt();

        System.out.println("Digite a idade em meses: ");
        int meses = sc.nextInt();

        System.out.println("Digite a idade em dias: ");
        int dias = sc.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + idadeEmDias);
        sc.close();
	}
}
