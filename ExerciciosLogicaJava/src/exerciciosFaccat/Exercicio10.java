	package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        if (valor > 10) {
            System.out.println("� MAIOR QUE 10!");
        } else {
            System.out.println("N�O � MAIOR QUE 10!");
        }
        sc.close();
    }
}
