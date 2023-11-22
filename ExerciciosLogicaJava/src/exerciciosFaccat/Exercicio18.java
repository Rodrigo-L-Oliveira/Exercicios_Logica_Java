package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio18 {
	 public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);

	        System.out.println("Digite o n�mero de horas trabalhadas no m�s:");
	        int horasTrabalhadas = sc.nextInt();

	        System.out.println("Digite o sal�rio por hora:");
	        double salarioHora = sc.nextDouble();

	        double salarioTotal;
	        int horasExtras = horasTrabalhadas - 160; // 4 semanas * 40 horas/semana

	        if (horasExtras > 0) {
	            double salarioHoraExtra = salarioHora * 1.5;
	            salarioTotal = (160 * salarioHora) + (horasExtras * salarioHoraExtra);
	        } else {
	            salarioTotal = horasTrabalhadas * salarioHora;
	        }

	        System.out.println("O sal�rio total �: " + salarioTotal);

	        sc.close();
	    }
}
