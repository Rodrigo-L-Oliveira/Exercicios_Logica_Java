package lista_metodos;

// Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de inteiros como parâmetro e retorna o maior elemento presente nela.

import java.util.Scanner;

public class Ex08MaiorElementoEmUmaMatriz {

	public static int encontrarMaiorElemento(int[][] matriz) {

        int maiorElemento = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }

        return maiorElemento;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o n�mero de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o n�mero de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento da posi��o [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int maiorElemento = encontrarMaiorElemento(matriz);

        System.out.println("O maior elemento na matriz �: " + maiorElemento);

        scanner.close();
    }
}
