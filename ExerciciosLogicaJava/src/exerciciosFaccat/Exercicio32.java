package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro homem:");
        int idadeH1 = sc.nextInt();

        System.out.println("Digite a idade do segundo homem:");
        int idadeH2 = sc.nextInt();

        System.out.println("Digite a idade da primeira mulher:");
        int idadeM1 = sc.nextInt();

        System.out.println("Digite a idade da segunda mulher:");
        int idadeM2 = sc.nextInt();

        int homemMaisVelho = Math.max(idadeH1, idadeH2);
        int homemMaisNovo = Math.min(idadeH1, idadeH2);
        int mulherMaisVelha = Math.max(idadeM1, idadeM2);
        int mulherMaisNova = Math.min(idadeM1, idadeM2);

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);
        
        sc.close();
    }
}
