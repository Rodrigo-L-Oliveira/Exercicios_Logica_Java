package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();

        System.out.println("Digite o seu sexo (M ou F):");
        char sexo = sc.next().charAt(0);

        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("O peso ideal para " + nome + " é: " + pesoIdeal + " kg");
        
        sc.close();
    }
}
