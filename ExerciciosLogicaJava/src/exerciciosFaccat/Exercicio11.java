package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        if (valor >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        sc.close();
    }
}
