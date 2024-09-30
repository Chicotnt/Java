package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		
		int vitoriasInter = 0;
		int vitoriasGremio = 0;
		int empates = 0;
		int grenais = 0;
		int novogrenal = 1;
		while (novogrenal == 1) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();
			if (golsInter > golsGremio) {
				vitoriasInter = vitoriasInter + 1;
				grenais = grenais + 1;
			}
			else if (golsGremio > golsInter) {
					vitoriasGremio = vitoriasGremio + 1;
					grenais = grenais + 1;
			}
			else {
					empates = empates + 1;
					grenais = grenais + 1;
			}
				System.out.println("Novo grenal (1-sim 2-nao)");
				novogrenal = sc.nextInt();
			}
			System.out.println(grenais + " grenais");
			System.out.println("Inter: " + vitoriasInter);
			System.out.println("Gremio: " + vitoriasGremio);
			System.out.println("Empates: " + empates);
			
			if (vitoriasInter > vitoriasGremio) {
				System.out.println("Inter venceu mais");
			}
			else if (vitoriasGremio > vitoriasInter) {
					System.out.println("Gremio venceu mais");
			}
			else {
					System.out.println("Nao houve vencedor");
			}
			
		sc.close();
	}
}