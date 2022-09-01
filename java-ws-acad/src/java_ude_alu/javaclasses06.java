package java_ude_alu;
import java.util.Locale;
import java.util.Scanner;

public class javaclasses06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			
			double f = (9.0 * c / 5.0) + 32;
			
			System.out.printf("Equivale em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir? [S/N]");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		sc.close();
	}

}
