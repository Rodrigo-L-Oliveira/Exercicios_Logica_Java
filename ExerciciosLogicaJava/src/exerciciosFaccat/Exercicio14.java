package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = sc.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você pode votar este ano.");
        } else {
            System.out.println("Você não pode votar este ano.");
        }

        sc.close();
    }	
}
