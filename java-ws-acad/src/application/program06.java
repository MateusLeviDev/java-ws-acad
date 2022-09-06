package application;

import java.util.Locale;
import java.util.Scanner;

public class program06 {

	public static final double PI = 3.14159;
	// 'final' serve para mostra que uma vez o valor atribuído ele nao mudará mais.
	
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = circumference(radius); // circum recebendo radius como argumento
			
			double v = volume(radius);
			
			System.out.printf("Circumference: %.2f%n", c);
			System.out.printf("Volume: %.2f%n", v);
			System.out.printf("PI value: %.2f%n", PI);
			
			sc.close();
		}
		
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		public static double volume(double radius) {
			return 4.0 * PI * radius * radius * radius / 3.0;
		}
	}
