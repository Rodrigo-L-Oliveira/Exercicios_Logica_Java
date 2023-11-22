package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio34 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoCorreto = 1234;
        int senhaCorreta = 9999;

        System.out.println("Digite o código do usuário:");
        int codigoUsuario = sc.nextInt();

        if (codigoUsuario != codigoCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println("Digite a senha:");
            int senha = sc.nextInt();

            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido!");
            }
        }
        
        sc.close();
    }
}
