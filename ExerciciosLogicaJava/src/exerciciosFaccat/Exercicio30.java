package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        
        System.out.println("Digite o valor de x:");
        x = sc.nextInt();

        System.out.println("Digite o valor de y:");
        y = sc.nextInt();

        z = (x * y) + 5;
        char resposta;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println("O valor de z é: " + z);
        System.out.println("A resposta é: " + resposta);

        sc.close();
    }
}

//                                          |-------------------------------------------|
//                                          | 				 Variáveis		  			|
//                                          |-------------------------------------------|
//                                          |		X 	|	Y	|	Z	|	Resposta	|
//                                          |		3	|	2	|   11	|		B		|
//                                          |	   150	|	3	|   455	|		C		|
//                                          |		7	|  -1	|	-2	|		A		|	
//                                          |	   -2	|   5	|	-5	|		A		|
//                                          |	   50	|	3	|	155	|		C		|
//                                          |-------------------------------------------|