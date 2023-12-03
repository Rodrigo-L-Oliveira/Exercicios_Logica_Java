package manzanoPag50;

public class ExercicioC {

	public static void main(String[] args) {
		
		int contador = 1;
		
		do {
		    if (contador % 4 == 0) {
		        System.out.println("o numero " + contador + " � divisivel por 4.");
		        contador = contador + 1;
		    } else {
		        contador = contador + 1;
		    }
		} while (contador < 201);

	}

}
