package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite a quantidade adquirida:");
        int quantidade = sc.nextInt();

        System.out.println("Digite o preço unitário:");
        double precoUnitario = sc.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;
        
        System.out.println(nome);
        System.out.println("Total: " + total);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total a pagar: " + totalAPagar);
        
        sc.close();
    }
}
