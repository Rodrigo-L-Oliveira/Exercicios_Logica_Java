package ExerciciosManzano.manzanoPag66;

import java.lang.Math;

public class ExercicioA {

	public static void main(String[] args) {
		
		float n;
		
		for (var contadora=15; contadora < 201;contadora++){
		    n = (float) Math.pow(contadora, 2);
		    System.out.println(contadora+"^ 2 = "+n);
		}
		
	}

}
