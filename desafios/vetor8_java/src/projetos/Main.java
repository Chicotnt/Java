package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] Sexo = new char[N];
		
		for (int i=0; i<N; i++) {
			altura[i] = sc.nextDouble();
			Sexo[i] = sc.next().charAt(0);
		}
		double menorAltura = altura[0];
		for (int i=0; i<N; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
	System.out.printf("Menor altura = %.2f%n", menorAltura);	
	double maiorAltura = altura[0];
	for (int i=0; i<N; i++) {
		if (altura[i] > maiorAltura) {
			maiorAltura = altura[i];
			
		}
	}
	
	System.out.printf("Maior altura = %.2f%n", maiorAltura);
	
	double somadasAlturasdasMulheres = 0.0;
	int contmulheres = 0;
	for (int i=0; i<N; i++) {
		if (Sexo[i] == 'F') {
			somadasAlturasdasMulheres = somadasAlturasdasMulheres + altura[i];
			contmulheres = contmulheres + 1;
		}	
	}
	
	double mediaalturasMulheres = somadasAlturasdasMulheres/contmulheres;
	System.out.printf("Media das alturas das mulheres = %.2f%n", mediaalturasMulheres);
	
	int NumerodeHomens = 0;
	for (int i=0; i<N; i++) {
		if (Sexo[i] == 'M') {
			NumerodeHomens = NumerodeHomens + 1;
		}
	}
	System.out.println("Numero de homens = " + NumerodeHomens);
	
		sc.close();
	}

}
