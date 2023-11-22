package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor total das vendas efetuadas pelo vendedor:");
        double valorVendas = sc.nextDouble();

        double comissao;
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05;
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
        
        sc.close();
        
    }
}
