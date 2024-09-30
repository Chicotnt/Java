package projetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Dias = sc.nextInt();
		int anos = Dias/365;
		int resto1 = Dias % 365;
		int meses = resto1/30;
		int dias = resto1 % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		sc.close();

	}
}
