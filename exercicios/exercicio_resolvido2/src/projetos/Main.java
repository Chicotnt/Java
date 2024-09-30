package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		Double media = (double) (idade1 + idade2) / 2;
		
		System.out.printf("A media de idade entre %s e %s é de %.1f anos", nome1, nome2, media);
		
		sc.close();

	}

}
