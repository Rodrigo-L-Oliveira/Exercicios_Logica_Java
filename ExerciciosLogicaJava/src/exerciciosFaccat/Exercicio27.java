package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();

        System.out.println("Digite o valor de C:");
        int C = sc.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
            sc.close();
        }
    }
}
