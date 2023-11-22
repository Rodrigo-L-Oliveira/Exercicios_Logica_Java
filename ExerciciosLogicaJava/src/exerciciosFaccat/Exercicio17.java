package exerciciosFaccat;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo:");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora de fim do jogo:");
        int horaFim = sc.nextInt();

        int duracao;
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

        sc.close();
    }
}
