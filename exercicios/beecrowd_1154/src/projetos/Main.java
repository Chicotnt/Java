package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade =sc.nextInt();
		int cont = 0;
		int soma = 0;
		while (idade >= 0) {
			cont = cont + 1;
			soma = soma + idade;
			idade = sc.nextInt();
		}
		
		if (idade < 0) {
			double media = (double) soma/cont;
			System.out.printf("%.2f%n", media);
		}
		

		sc.close();
		
	}

}

