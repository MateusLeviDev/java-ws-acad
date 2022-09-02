/* Ler um número inteiro N e calcular todos os seus divisores. */
import java.util.Scanner;
public class exemplojava22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Mat básica. Todo número é div por 1 e por ele mesmo */
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
