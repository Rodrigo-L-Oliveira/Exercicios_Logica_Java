package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio40 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de b:");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = sc.nextDouble();

        String mens;

        if ((a < b+c) && (b < a+c) && (c < a+b)) {
            if ((a == b) && (b == c)) {
                mens = "Triângulo Equilátero";
            } else if ((a == b) || (b == c) || (a == c)) {
                mens = "Triângulo Isósceles";
            } else {
                mens = "Triângulo Escaleno";
            }
        } else {
            mens = "Não é possível formar um triângulo";
        }

        System.out.println(mens);
        
        sc.close();
    }
}

//|--------------------------------------------------------------|
//|						  		Variáveis						 |
//|--------------------------------------------------------------|
//|		A	|	B	|	C	|	         	Mens	  	 		 |
//|---------|-------|-------|------------------------------------|
//|		1	|	2	|	3	| Não é possível formar um Triângulo |		
//|		3	|	4	|	5	|       Triângulo Isósceles			 |
//|		2	|	2	|	4	| Não é possível formar um Triângulo |
//|		4	|	4	|	4	|		Triângulo Equilátero		 |
//|		5	|	3	|	3	|		Triângulo Isósceles			 |
//|--------------------------------------------------------------|