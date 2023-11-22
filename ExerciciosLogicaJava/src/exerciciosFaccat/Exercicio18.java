package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio18 {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);

	        System.out.println("Digite o número de horas trabalhadas no mês:");
	        int horasTrabalhadas = sc.nextInt();

	        System.out.println("Digite o salário por hora:");
	        double salarioHora = sc.nextDouble();

	        double salarioTotal;
	        int horasExtras = horasTrabalhadas - 160; // 4 semanas * 40 horas/semana

	        if (horasExtras > 0) {
	            double salarioHoraExtra = salarioHora * 1.5;
	            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHoraExtra);
	        } else {
	            salarioTotal = horasTrabalhadas * salarioHora;
	        }

	        System.out.println("O salário total é: " + salarioTotal);

	        sc.close();
	    }
}
