package ExerciciosManzano.manzanoPag66;

public class ExercicioI {

	public static void main(String[] args) {

		int proximoNumero = 0;
		int numero1 = 1;
		int numero2 = 1;
		int contadora;

		System.out.println(numero1);
		System.out.println(numero2);

		for (contadora = 3; contadora <= 15; contadora++) {
			proximoNumero = numero1 + numero2;
			System.out.println(proximoNumero);
			numero1 = numero2;
			numero2 = proximoNumero;
		}

	}

}
