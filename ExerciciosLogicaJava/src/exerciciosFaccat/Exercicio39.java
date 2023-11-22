package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do empregado:");
        int codigo = sc.nextInt();

        System.out.println("Digite o ano de nascimento do empregado:");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano de ingresso do empregado na empresa:");
        int anoIngresso = sc.nextInt();

        int idade = 2023 - anoNascimento; // assumindo que o ano atual é 2023
        int tempoTrabalho = 2023 - anoIngresso; // assumindo que o ano atual é 2023
        
        System.out.println("Código do empregado: " + codigo);
        System.out.println("Idade do empregado: " + idade);
        System.out.println("Tempo de trabalho do empregado: " + tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
        
        sc.close();
    }
}
