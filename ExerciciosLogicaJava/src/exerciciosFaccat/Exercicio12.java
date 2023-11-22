package exerciciosFaccat;
import java.util.Scanner;


public class Exercicio12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de maçãs compradas:");
        int numeroDeMacas = sc.nextInt();

        double custoTotal;
        if (numeroDeMacas < 12) {
            custoTotal = numeroDeMacas * 1.30;
        } else {
            custoTotal = numeroDeMacas * 1.00;
        }

        System.out.println("O custo total da compra é: R$ " + custoTotal);
        sc.close();
    }
}
