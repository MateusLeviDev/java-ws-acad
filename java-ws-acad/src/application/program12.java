package application;

import java.util.Locale;
import java.util.Scanner;

public class program12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		// criar 3 vetores, para guardar idade, altura e idade.
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("dados da " + (i+1) + "ª pessoa");
			System.out.println("Nome: ");
			nomes[i] = sc.next();
			System.out.println("idade: ");
			idades[i] = sc.nextInt();
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
		} 
		double sum = 0;
		
		for (int i=0;i<n;i++) {
			sum += altura[i];
		}
		double avgAltura = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avgAltura );
		
		int cont = 0;
		for (int i=0;i<n;i++) {
			if (idades[i] < 16) {
				cont += 1;
			}
		}
		
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		
		
		sc.close();

	}

}
