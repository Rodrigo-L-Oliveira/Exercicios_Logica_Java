package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n�mero da conta do cliente:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o saldo da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do d�bito:");
        double debito = sc.nextDouble();

        System.out.println("Digite o valor do cr�dito:");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual da conta " + numeroConta + " �: R$ " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        sc.close();
    }
}
