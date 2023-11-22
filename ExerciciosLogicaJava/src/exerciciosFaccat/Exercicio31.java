package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio31 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de litros vendidos:");
        double litros = sc.nextDouble();

        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina):");
        char tipo = sc.next().charAt(0);

        double precoAlcool = 2.90;
        double precoGasolina = 3.30;
        double total = 0;

        if (tipo == 'A') {
            if (litros <= 20) {
                total = litros * precoAlcool * (1 - 0.03);
            } else {
                total = litros * precoAlcool * (1 - 0.05);
            }
        } else if (tipo == 'G') {
            if (litros <= 20) {
                total = litros * precoGasolina * (1 - 0.04);
            } else {
                total = litros * precoGasolina * (1 - 0.06);
            }
        }

        System.out.println("O valor a ser pago pelo cliente é: R$ " + total);
        sc.close();
	}
}

