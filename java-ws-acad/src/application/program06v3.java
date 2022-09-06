package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculatorv2;

public class program06v3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = Calculatorv2.circumference(radius);
		
		double v = Calculatorv2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculatorv2.PI);
		
		sc.close();
	}

}
