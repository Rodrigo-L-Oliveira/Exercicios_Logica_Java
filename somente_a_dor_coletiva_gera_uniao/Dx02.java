package somente_a_dor_coletiva_gera_uniao;

// 2)Imprima os números impares de 1 a 10, usando continue para pular os números pares. 

public class Dx02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
