/* Lendo um valor inteiro de X. Em seguida mostrando quantos 
 * ímpares possui nesse intervalo 
 * */
import java.util.Scanner;

public class exemplojava16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i<=x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
