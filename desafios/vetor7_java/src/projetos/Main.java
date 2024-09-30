package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] Nomes = new String[N];
		double[]semestre1 = new double[N];
		double[]semestre2 = new double[N];
		
		for(int i=0; i<N; i++) {
			Nomes[i] = sc.next();
			semestre1[i] = sc.nextDouble();
			semestre2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		
		for (int i=0; i<N; i++) {
			double media = (semestre1[i] + semestre2[i])/2;
			if (media >= 6) {
				System.out.println(Nomes[i]);
			}
			
		}
		
		sc.close();
	}

}
