package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for (int i = 0; i<N; i++) {
			vet [i] = sc.nextDouble();
		}
		
		double MaiorNumero = 0.0;
		int PosicaoMaiorNumero = 0;
		for (int i = 0; i<N; i++) {
			if (vet[i] > MaiorNumero) {
				MaiorNumero = vet[i];
				PosicaoMaiorNumero = i;	
			}
		}
		System.out.printf("%.1f%n", MaiorNumero);
		System.out.println(PosicaoMaiorNumero);
		
		sc.close();
	}

}
