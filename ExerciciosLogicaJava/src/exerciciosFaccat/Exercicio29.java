package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero:");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int segundoNumero = sc.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("N�meros iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro � maior");
        } else {
            System.out.println("Segundo maior");
        }

        sc.close();
    }
}
