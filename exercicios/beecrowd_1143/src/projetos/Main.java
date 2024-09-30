package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inicio = 1;
		for (int i=1; i<=n; i++) {
			int segundo = inicio * i;
			int terceiro = inicio * i * i;
			System.out.printf("%d %d %d%n", inicio, segundo, terceiro);
			inicio = inicio + 1;
		}
		
		sc.close();
		
		
	}

}
