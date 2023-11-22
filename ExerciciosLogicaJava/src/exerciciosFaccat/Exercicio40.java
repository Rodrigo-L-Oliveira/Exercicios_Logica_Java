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
                mens = "Tri�ngulo Equil�tero";
            } else if ((a == b) || (b == c) || (a == c)) {
                mens = "Tri�ngulo Is�sceles";
            } else {
                mens = "Tri�ngulo Escaleno";
            }
        } else {
            mens = "N�o � poss�vel formar um tri�ngulo";
        }

        System.out.println(mens);
        
        sc.close();
    }
}

//|--------------------------------------------------------------|
//|						  		Vari�veis						 |
//|--------------------------------------------------------------|
//|		A	|	B	|	C	|	         	Mens	  	 		 |
//|---------|-------|-------|------------------------------------|
//|		1	|	2	|	3	| N�o � poss�vel formar um Tri�ngulo |		
//|		3	|	4	|	5	|       Tri�ngulo Is�sceles			 |
//|		2	|	2	|	4	| N�o � poss�vel formar um Tri�ngulo |
//|		4	|	4	|	4	|		Tri�ngulo Equil�tero		 |
//|		5	|	3	|	3	|		Tri�ngulo Is�sceles			 |
//|--------------------------------------------------------------|