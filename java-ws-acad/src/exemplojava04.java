import java.util.Locale;
import java.util.Scanner;
public class exemplojava04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hora;
		double valorHora, salario;
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		valorHora= sc.nextDouble();
		
		salario = hora * valorHora; 
		
		System.out.println("Número funcionário: " + numero);
		System.out.printf("Salário: R$ %.2f%n", salario);
		
		sc.close();

	}

}
