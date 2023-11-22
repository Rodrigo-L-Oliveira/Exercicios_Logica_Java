package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade (em Kg) de morangos:");
        double kgMorangos = sc.nextDouble();

        System.out.println("Digite a quantidade (em Kg) de maçãs:");
        double kgMacas = sc.nextDouble();

        double precoMorangos = kgMorangos <= 5 ? 2.50 : 2.20;
        double precoMacas = kgMacas <= 5 ? 1.80 : 1.50;

        double total = (precoMorangos * kgMorangos) + (precoMacas * kgMacas);

        if (kgMorangos + kgMacas > 8 || total > 25) {
            total *= 0.9;  // Desconto de 10%
        }

        System.out.println("O valor a ser pago pelo cliente é: R$ " + total);
        
        sc.close();
    }

}
