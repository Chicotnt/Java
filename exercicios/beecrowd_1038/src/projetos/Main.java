package projetos;


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		double preco = 4.0;
		if (codigo == 1) {
			total = quantidade*preco;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 2) {
		    preco = 4.5;
			total = quantidade*preco;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 3) {
			preco = 5.0;
			total = quantidade*preco;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 4) {
			preco = 2.0;
			total = quantidade*preco;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (codigo == 5) {
			preco = 1.5;
			total = quantidade*preco;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
		
	}
}
