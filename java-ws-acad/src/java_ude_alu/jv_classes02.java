package java_ude_alu;
import java.util.Locale;
import java.util.Scanner;
public class jv_classes02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hora;
		double valorHora, salario;
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		valorHora= sc.nextDouble();
		
		salario = hora * valorHora; 
		
		System.out.println("N�mero funcion�rio: " + numero);
		System.out.printf("Sal�rio: R$ %.2f%n", salario);
		
		sc.close();
	}

}
