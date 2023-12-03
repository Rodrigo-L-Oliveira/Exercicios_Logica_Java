package lista_metodos;

import java.util.Scanner;

// Crie um método chamado soma que recebe dois números como parâmetros e retorna a soma deles.

public class Ex01SomaDeDoisNumeros {

    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int num2 = sc.nextInt();

        int resultado = soma(num1, num2);
        System.out.println("A soma �: " + resultado);

        sc.close();
    }
}
