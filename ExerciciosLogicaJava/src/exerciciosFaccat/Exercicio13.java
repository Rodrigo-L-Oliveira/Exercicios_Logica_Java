package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avalia��o:");
        double nota01 = sc.nextDouble();

        System.out.println("Digite a nota da segunda avalia��o:");
        double nota02 = sc.nextDouble();

        double media = (nota01 + nota02) / 2;

        if (media >= 6) {
            System.out.println("O aluno foi aprovado com m�dia: " + media);
        } else {
            System.out.println("O aluno n�o foi aprovado. M�dia: " + media);
        }
        sc.close();
    }
}
