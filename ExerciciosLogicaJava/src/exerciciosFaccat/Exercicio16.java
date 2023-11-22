package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        if (valor1 < valor2) {
            System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Os valores em ordem crescente são: " + valor2 + ", " + valor1);
        }

        sc.close();
    }
}
