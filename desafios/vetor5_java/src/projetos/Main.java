package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Vet = new int[N];
		
		for (int i=0; i<N; i++) {
			Vet[i] = sc.nextInt();
		}

		int soma = 0;
		int NumerosPares = 0;
		for (int i=0; i<N; i++) {
			if (Vet[i] % 2 == 0) {
				NumerosPares = NumerosPares + Vet[i];
				soma = soma + 1;
			}
		}
		
		double media = 0.0;
		for (int i=0; i<N; i++) {
			media = NumerosPares/soma;
		}
		System.out.printf("%.1f%n", media);
		
		
		sc.close();
	}

}
