package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double quociente;
		for (int i=1; i <=n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				quociente = (double) x / y;
				System.out.printf("%.1f%n", quociente);
			}
		}

		sc.close();
	}

}
