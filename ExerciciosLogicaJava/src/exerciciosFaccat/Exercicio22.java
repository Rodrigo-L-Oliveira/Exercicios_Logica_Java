package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio22 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a quantidade atual em estoque:");
	        int quantidadeAtual = sc.nextInt();

	        System.out.println("Digite a quantidade m�xima em estoque:");
	        int quantidadeMaxima = sc.nextInt();

	        System.out.println("Digite a quantidade m�nima em estoque:");
	        int quantidadeMinima = sc.nextInt();

	        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

	        System.out.println("A quantidade m�dia em estoque �: " + quantidadeMedia);

	        if (quantidadeAtual >= quantidadeMedia) {
	            System.out.println("N�o efetuar compra");
	        } else {
	            System.out.println("Efetuar compra");
	        }
	        sc.close();
	 }
}
