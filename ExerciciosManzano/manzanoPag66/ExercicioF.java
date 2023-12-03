package ExerciciosManzano.manzanoPag66;

public class ExercicioF {

	public static void main(String[] args) {

		int contadora = 0;

		System.out.println("Valores num�ricos divisiveis por 4 na faixa de 1 at� 200");

		for (contadora = 4; contadora < 201; contadora++) {
			if (contadora % 4 == 0) {
				System.out.println(contadora + " � divisivel por 4");
			}
		}

	}

}
