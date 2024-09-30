package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempo, velocidade;
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		double gasto = (double) velocidade*tempo/12;
		System.out.printf("%.3f%n", gasto);
		
		sc.close();
	}

}
