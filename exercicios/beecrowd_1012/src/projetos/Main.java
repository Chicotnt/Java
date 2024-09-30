package projetos;

import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double areatriangulo = A*C/2;
		double areacirculo = 3.14159*(Math.pow(C, 2));
		double areatrapezio = (A+B)*C/2;
		double areaquadrado = Math.pow(B, 2);
		double arearetangulo = A*B;
		System.out.printf("TRIANGULO: %.3f%n", areatriangulo);
		System.out.printf("CIRCULO: %.3f%n", areacirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areatrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaquadrado);
		System.out.printf("RETANGULO: %.3f%n", arearetangulo);
		sc.close();
	}
}
