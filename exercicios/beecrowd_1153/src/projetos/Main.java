package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = n;
		for (int i =1; i<n; i++) {
		fatorial = fatorial * (n - i);
		}
		System.out.println(fatorial);
		
		sc.close();
		
	}

}
