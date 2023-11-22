package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta do cliente:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do débito:");
        double debito = sc.nextDouble();

        System.out.println("Digite o valor do crédito:");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual da conta " + numeroConta + " é: R$ " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        sc.close();
    }
}
