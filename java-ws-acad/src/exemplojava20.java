/* 
 * programa para ler um n�mero n. depois ler n pares de n�meros e 
 * mostre a divis�o do primeiro pelo segundo. caso denominador for igual a 0 
 * 'opera��o imposs�vel'.
 * */
import java.util.Scanner;
public class exemplojava20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Opera��o imposs�vel!");	
			}
			else {
				double div = (double) x / y;
				System.out.printf("O resultado foi: %.2f%n", div);
			}
		}
		
		sc.close();
	}

}
