import java.util.Scanner;
public class exemplojava01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma; 
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("Soma: " + soma);
		
		sc.close();

	}

}
