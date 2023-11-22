package exerciciosFaccat;

public class Exercicio35 {
	public static void main(String[] args) {
        boolean A = true;
        boolean B = true;
        boolean C = false;

        // a) (A e B) ou (A xou B)
        boolean resultadoA = (A && B) || (A ^ B);
        System.out.println("Resultado da express�o a): " + resultadoA);

        // b) (A ou B) e (A e C)
        boolean resultadoB = (A || B) && (A && C);
        System.out.println("Resultado da express�o b): " + resultadoB);

        // c) A ou C e B xou A e n�o B
        boolean resultadoC = A || C && B ^ A && !B;
        System.out.println("Resultado da express�o c): " + resultadoC);
    }
}
