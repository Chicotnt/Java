package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int B = (x + y + Math.abs(x - y))/2;
		int W = (B + z + Math.abs(B - z))/2;
		
		System.out.println(W + " eh o maior");
		
		sc.close();

	}

}
