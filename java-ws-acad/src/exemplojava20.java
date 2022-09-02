/* 
 * programa para ler um número n. depois ler n pares de números e 
 * mostre a divisão do primeiro pelo segundo. caso denominador for igual a 0 
 * 'operação impossível'.
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
				System.out.println("Operação impossível!");	
			}
			else {
				double div = (double) x / y;
				System.out.printf("O resultado foi: %.2f%n", div);
			}
		}
		
		sc.close();
	}

}
