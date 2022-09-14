package application;

import java.util.Locale;
import java.util.Scanner;

public class program15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdPares;
		
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros pares: ");
		
		qtdPares = 0;
		
		for (int i=0; i<n;i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d - ", vect[i]);
				qtdPares++;
			}
		}
		System.out.printf("\nQUANTIDADE DE PARES = %d\n", qtdPares);

		sc.close();
	}

}
