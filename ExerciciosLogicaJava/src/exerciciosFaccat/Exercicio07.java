package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n�mero de carros vendidos pelo vendedor:");
        int carrosVendidos = sc.nextInt();

        System.out.println("Digite o valor total das vendas efetuadas pelo vendedor:");
        double valorVendas = sc.nextDouble();

        System.out.println("Digite o sal�rio fixo do vendedor:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor que o vendedor recebe por carro vendido:");
        double valorPorCarro = sc.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (valorVendas * 0.05);

        System.out.println("O sal�rio final do vendedor �: " + salarioFinal);
        sc.close();
    }
}