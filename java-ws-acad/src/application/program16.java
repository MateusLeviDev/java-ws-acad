package application;

import java.util.Locale;
import java.util.Scanner;

public class program16 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n, posMaior;
		double maior; 
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		//em seguida criar para armazenar o vetor
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o número: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posMaior = 0;
		
		for (int i=1;i<n;i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i; 
			}
		}
		
		System.out.printf("Maior valor: %.1f\n", maior);
		System.out.printf("Posição: %d\n", posMaior);
		

		
		sc.close();

	}

}
