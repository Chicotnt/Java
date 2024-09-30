package projetos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float nota1 = sc.nextFloat();
		float nota2 = sc.nextFloat();
		float nota3 = sc.nextFloat();
		float nota4 = sc.nextFloat();
		float peso2 = nota1*2f;
		float peso3 = nota2*3f;
		float peso4 = nota3*4f;
		float peso1 = nota4*1f;
		float media = (peso1 + peso2 + peso3 + peso4)/10f;
		
		if (media >= 7f) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		}
		else {
			if (media < 5f) {
				System.out.printf("Media: %.1f%n", media);
				System.out.println("Aluno reprovado.");	
			}
			else {
				System.out.printf("Media: %.1f%n", media);			
				System.out.println("Aluno em exame.");
				float notadoexame = sc.nextFloat();
				System.out.printf("Nota do exame: %.1f%n", notadoexame);
				double mediafinal = (media + notadoexame)/2f;
				
				if (mediafinal >= 5f) {
					System.out.println("Aluno aprovado.");
				}
				else {
					System.out.println("Aluno reprovado.");
				}
				System.out.printf("Media final: %.1f%n", mediafinal);
			}		
			
		}

		sc.close();
	}

}
