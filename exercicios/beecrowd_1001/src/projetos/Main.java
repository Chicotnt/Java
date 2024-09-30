package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, x;
		A = sc.nextInt();
		B = sc.nextInt();
		x = A + B;
		
		System.out.println("X = " + x);
		
		sc.close();
	}

}
