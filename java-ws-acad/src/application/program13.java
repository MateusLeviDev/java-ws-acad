package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Rent[] vect = new Rent[10]; // criando vect, no caso de 10 posições.
									// vect com posições nulas ainda.
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(); //para dar uma quebra de linha 
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();

			Rent rent = new Rent(name, email); // estanciei em memória uma nova locação

			vect[roomNumber] = rent; // room vai receber o vect estanciado acima
		}

		System.out.println(); //para dar uma quebra de linha 
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) { //imprimir o qnd o vect != null
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();

	}

}
