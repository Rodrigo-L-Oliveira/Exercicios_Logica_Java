package lista_metodos;

import java.util.Scanner;

// Implemente um método chamado ehPrimo que recebe um número como parâetro e retorna true se ele for primo e false caso contrario. 

public class Ex02VerificaoDeNumeroPrimo {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        int numero = sc.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " � primo.");
        } else {
            System.out.println(numero + " n�o � primo.");
        }
        
        sc.close();
    }
}
