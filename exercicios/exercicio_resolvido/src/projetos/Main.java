package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double B = sc.nextDouble();
		double A = sc.nextDouble();
		double area = B*A;
		double perimetro = B*2+A*2;
		double diagonal = Math.sqrt(Math.pow(B, 2.0) + Math.pow(A, 2.0));
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}

}
