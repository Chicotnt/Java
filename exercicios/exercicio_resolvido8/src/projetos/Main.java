package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		double soma = 0.0;
		for (int i=0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
			soma = soma + altura[i];
		}
		double media = soma/N;
		System.out.printf("Altura média: %.2f%n", media);

		int cont = 0;
		for (int i=0; i<N; i++) {
			if (idade[i] < 16) {
			cont = cont + 1;	
			}
		}
		double x = (double) cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		
		sc.close();
	}
}
		
