package projetos;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y, z;
		int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		x = sc.nextDouble();
		c = sc.nextInt();
		d = sc.nextInt();
		y = sc.nextDouble();
		z = (double) b*x+d*y;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", z);	
		sc.close();
	}
}
