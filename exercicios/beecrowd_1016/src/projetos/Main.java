package projetos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km, tempo;
		km = sc.nextInt();
		int min = 2;
		tempo = km*min;
		System.out.println(tempo + " minutos");
		
		sc.close();

		
	}

}
