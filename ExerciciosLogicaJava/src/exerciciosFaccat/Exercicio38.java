package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio38 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double N1 = sc.nextDouble();

        System.out.println("Digite a segunda nota:");
        double N2 = sc.nextDouble();

        System.out.println("Digite a terceira nota:");
        double N3 = sc.nextDouble();

        System.out.println("Digite a média dos exercícios:");
        double mediaExercicios = sc.nextDouble();

        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;
        String conceito;

        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        } else if (mediaAproveitamento >= 7.5) {
            conceito = "B";
        } else if (mediaAproveitamento >= 6.0) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);
    }
}
