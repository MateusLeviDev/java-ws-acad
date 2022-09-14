package application;

import java.util.Locale;
import java.util.Scanner;

public class program18 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro N e depois um vetor de N n�meros
		 * reais. Em seguida, mostrar na tela a m�dia aritm�tica de todos elementos com
		 * tr�s casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da m�dia, com uma casa decimal cada.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double media, soma;

		System.out.print("Quantos elementos ter� o vetor? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
		}

		soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}

		media = soma / n;

		System.out.printf("M�dia do vetor: %.3f%n", media);

		System.out.print("Elementos abaixo da m�dia: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f - ", vect[i]);

			}

		}

	}

}
