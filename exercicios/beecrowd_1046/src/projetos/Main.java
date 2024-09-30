package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horainicial = sc.nextInt();
		int horafinal = sc.nextInt();
		int duracao;
		
		if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else {
			duracao = 24 - horainicial + horafinal;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}

		sc.close();
	}

}