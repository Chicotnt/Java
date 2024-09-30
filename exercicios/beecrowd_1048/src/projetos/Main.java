package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double novosalario;
		double reajuste;
		
		if (salario <= 400.00) {
			reajuste = salario*0.15;
			novosalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
		}
		else if (salario >= 400.01 && salario <= 800.00) {
			reajuste = salario*0.12;
			novosalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		}
			
		else if (salario >= 800.01 && salario <= 1200.00) {
			reajuste = salario*0.10;
			novosalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		}
					
		else if (salario >= 1200 && salario <= 2000) {
			reajuste = salario*0.07;
			novosalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		else if (salario > 2000.00) {
			reajuste = salario*0.04;
			novosalario = salario + reajuste;
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");	
		}
		
		sc.close();

	}

}
