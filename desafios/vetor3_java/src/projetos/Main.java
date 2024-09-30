package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		double[] A = new double[N];
		double[] B = new double[N];
		
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextDouble();
		}
		
		for (int i =0; i<N; i++) {
			B[i] = sc.nextDouble();
		}
		
		double[] C = new double[N];
		for (int i =0; i<N; i++) {
			C[i] = A[i] + B[i];
			System.out.print(C[i] + " ");
			
		}
		
		sc.close();
		
	}
}
