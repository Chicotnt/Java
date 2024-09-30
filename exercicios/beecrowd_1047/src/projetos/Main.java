package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = instanteFinal - instanteInicial;
		}
		
		else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		
		int duracaoHora = duracao/60;
		int duracaoMinutos = duracao%60;
		
		System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();

	}

}
