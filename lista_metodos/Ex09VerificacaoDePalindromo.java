package lista_metodos;

// Crie um método chamado ehPalindromo que recebe uma string como parâmetro e retorna true se ela for um palíndromo e false caso contrario. 

import java.util.Scanner;

public class Ex09VerificacaoDePalindromo {

	public static boolean ehPalindromo(String palavra) {
        
        String palavraProcessada = palavra.replaceAll("\\s", "").toLowerCase();
        int inicio = 0;
        int fim = palavraProcessada.length() - 1;

        while (inicio < fim) {
            if (palavraProcessada.charAt(inicio) != palavraProcessada.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavraUsuario = scanner.nextLine();

        System.out.println(palavraUsuario + " � pal�ndromo? " + ehPalindromo(palavraUsuario));

        scanner.close();
    }
}
