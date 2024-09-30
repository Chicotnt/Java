package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
		System.out.println("Digite a temperatura: ");
		double c = sc.nextDouble();
		double F = 9*c/5 + 32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}
		while (resp != 'n');
	
		sc.close();
	}

}
