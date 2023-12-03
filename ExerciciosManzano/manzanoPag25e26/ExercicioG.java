package manzanoPag25e26;

import java.util.Scanner;

public class ExercicioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Varieveis Soma 

		int valorAdicaoAB = 0;
		int valorAdicaoAC = 0;
		int valorAdicaoAD = 0;

		int valorAdicaoBC = 0;
		int valorAdicaoBD = 0;

		int valorAdicaoCD = 0;

		/*_____________________________________________________________________________________________________ */
		                                         //Varieveis mu�tiplica��o   
		int valorMultiAB = 0;
		int valorMultiAC = 0;
		int valorMultiAD = 0;

		int valorMultiBC = 0;
		int valorMultiBD = 0;

		int valorMultiCD = 0;
		
		int valorA, valorB, valorC, valorD;


		System.out.println("Digite o valor de A");
		valorA = sc.nextInt();
		System.out.println("Digite o valor de B");
		valorB = sc.nextInt();
		System.out.println("Digite o valor de C");
		valorC = sc.nextInt();
		System.out.println("Digite o valor de D");
		valorD = sc.nextInt();
				
				


		//______________________________________________________________________
		                         //Fazer Somas

		valorAdicaoAB = valorA+valorB;
		valorAdicaoAC = valorA+valorC;
		valorAdicaoAD = valorA+valorD;

		valorAdicaoBC = valorB+valorC;
		valorAdicaoBD = valorB+valorD;

		valorAdicaoCD = valorC+valorD;

		//______________________________________________________________________
		                         //Fazer Multiplica��es

		valorMultiAB = valorA*valorB;
		valorMultiAC = valorA*valorC;
		valorMultiAD = valorA*valorD;

		valorMultiBC = valorB*valorC;
		valorMultiBD = valorB*valorD;

		valorMultiCD = valorC*valorD;


		//______________________________________________________________________
		                              //Exibir Somas
		                             
		System.out.println("O valor da adi��o de A + B �: "+valorAdicaoAB);
		System.out.println("O valor da adi��o de A + C �: "+valorAdicaoAC);
		System.out.println("O valor da adi��o de A + D �: "+valorAdicaoAD);

		System.out.println("O valor da adi��o de B + C �: "+valorAdicaoBC);
		System.out.println("O valor da adi��o de B + D �: "+valorAdicaoBD);

		System.out.println("O valor da adi��o de C + D �: "+valorAdicaoCD);

		//_____________________________________________________________
		                          //Exibir Multiplica��es
		                          
		System.out.println("O valor da multiplica��o de A com B �: "+valorMultiAB);
		System.out.println("O valor da multiplica��o de A com C �: "+valorMultiAC);
		System.out.println("O valor da multiplica��o de A com D �: "+valorMultiAD);

		System.out.println("O valor da multiplica��o de B com C �: "+valorMultiBC);
		System.out.println("O valor da multiplica��o de B com D �: "+valorMultiBD);

		System.out.println("O valor da multiplica��o de C com D �: "+valorMultiCD);
		
		sc.close();

	}

}
