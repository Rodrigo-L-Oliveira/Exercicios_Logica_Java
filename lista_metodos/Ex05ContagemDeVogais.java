package lista_metodos;

// Crie um método chamado contarVogais que recebe uma string como parâmetro e retorna o número de vogais nela. 

import java.util.Scanner;

public class Ex05ContagemDeVogais {

	public static int contarVogais(String texto) {
		
        texto = texto.toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        return contadorVogais;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int vogais = contarVogais(input);
        System.out.println("N�mero de vogais na string: " + vogais);

        scanner.close();
    }
}
