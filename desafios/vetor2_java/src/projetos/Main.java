package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] Vet = new int[N];
		
		for (int i =0; i<N; i++) {
			Vet[i] = sc.nextInt();
		}
		int numerosPares = 0;
		for (int i =0; i<N; i++) {
			if (Vet[i] % 2 == 0) {
				numerosPares = Vet[i];
				System.out.print(numerosPares + " ");
			}
		}
		System.out.println();
		
		int QuantnumerosPares = 0;
		for (int i =0; i<N; i++) {
			if (Vet[i] % 2 == 0) {
		QuantnumerosPares = QuantnumerosPares + 1;
		}
		}
		System.out.println(QuantnumerosPares);	

		sc.close();
		
	}
}
