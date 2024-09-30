package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		double cont = 0.0;
		double soma = 0;
		while (idade >= 0.0) {
			cont = cont + 1.0;
			soma = (double) soma + idade;
			idade = sc.nextInt();
		}
		double media = (double) soma/cont;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
