package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double x = sc.nextDouble();
		
		if (x >= 0 && x <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (x > 25.00 && x <= 50.00) {
			System.out.println("Intervalo (25,50]");

		}
		else if (x > 50.00 && x <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if (x > 75 && x <= 100) {
			System.out.println("Intervalo (75,100]");
		}
	    else                          {
	    	System.out.println("Fora de intervalo");

		}
	
		sc.close();

	}

}
