package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] Item = new String[N];
		double[] Compra = new double[N];
		double[] Venda = new double[N];
		
		for(int i=0; i<N; i++) {
			Item[i] = sc.next();
			Compra[i] = sc.nextDouble();
			Venda[i] = sc.nextDouble();
		}
		
		int menorque10 = 0;
		int entre10E20 = 0;
		int maiorque20 = 0;
		for(int i=0; i<N; i++) {
		double lucro = Venda[i] - Compra[i];
		double percentualLucro = lucro / Compra[i] * 100.0;
		
		if  (percentualLucro < 10.0) {
			menorque10 = menorque10 + 1;
		}
		else if (percentualLucro <= 20.0 && percentualLucro >=10) {
				entre10E20 = entre10E20 + 1;
		}
		
		else {
			maiorque20 = maiorque20 +1;
		}
		}
		
		System.out.println("Lucro abaixo de 10%: " + menorque10);
		System.out.println("Lucro entre 10% e 20%: " + entre10E20);
		System.out.println("Lucro acima de 20%: " + maiorque20);
		System.out.println("Valor total de compra: " );
		
		double totalDeCompra = 0.0;
		double totalDeVenda = 0.0;
		
		for(int i=0; i<N; i++) {
			totalDeCompra = totalDeCompra + Compra[i];
			totalDeVenda = totalDeVenda + Venda[i];
		}
		
		double lucroTotal = totalDeVenda - totalDeCompra;
		System.out.printf("Valor total de compra: %.2f%n", totalDeCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalDeVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		
		sc.close();
				
	}

}
