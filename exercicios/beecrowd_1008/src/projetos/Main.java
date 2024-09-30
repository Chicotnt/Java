package projetos;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double SALARY, HOURS, VALUE;
		
		int NUMBER = sc.nextInt();
		HOURS = sc.nextDouble();
		VALUE = sc.nextDouble();
		SALARY = HOURS*VALUE;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);	
		sc.close();	}
}
