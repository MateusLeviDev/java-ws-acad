package application;

import java.util.Locale;
import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
