package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();

        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3) {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2 + ", " + valor3);
        
        sc.close();
    }
}
