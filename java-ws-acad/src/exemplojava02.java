import java.util.Locale;
import java.util.Scanner;
public class exemplojava02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, r, pi = 3.14159;
		
		r = sc.nextDouble();
		a = pi * r * r;
		
		System.out.printf("A = %.4f%n", a);
		
			sc.close();
			
		 

	}

}
