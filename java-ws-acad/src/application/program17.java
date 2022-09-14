package application;

import java.util.Locale;
import java.util.Scanner;

public class program17 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n; 

		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n]; // criando vetores a, b e c
		int[] c = new int[n];

		System.out.println("Digite os valores de a: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite os valores de b:");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i]; //vetor c vai ser a soma dos vet a e b em suas respectivas posições 
		}

		System.out.println("Vetor resultante: ");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", c[i]); //e o vetor result vai ser as respectivas posições. 
		}

		sc.close();
	}
}