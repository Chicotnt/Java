package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] Vet = new double[N];
		for (int i =0; i<N; i++) {
			Vet[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i =0; i<N; i++) {
			soma = soma + Vet[i];
		}
		
		double media = soma/N;
		System.out.printf("%.3f%n", media);
		
		for (int i =0; i<N; i++) {
			if (Vet[i] < media) {
				System.out.println(Vet[i]);
			}
		}
		
		
		sc.close();
	}

}
