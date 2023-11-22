package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();

        int maior1, maior2;

        if (valor1 > valor2 && valor1 > valor3) {
            maior1 = valor1;
            maior2 = (valor2 > valor3) ? valor2 : valor3;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior1 = valor2;
            maior2 = (valor1 > valor3) ? valor1 : valor3;
        } else {
            maior1 = valor3;
            maior2 = (valor1 > valor2) ? valor1 : valor2;
        }

        int soma = maior1 + maior2;

        System.out.println("A soma dos dois maiores valores é: " + soma);
        sc.close();
	}
	
}
