package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota01 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota02 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota03 = sc.nextDouble();

        double mediaFinal = ((nota01 * 2) + (nota02 * 3) + (nota03 * 5)) / 10;

        System.out.println("A média final do aluno é: " + mediaFinal);
        sc.close();
    }
}
