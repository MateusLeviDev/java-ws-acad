import java.util.Scanner;

public class exemplojava08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!!");
		}
		sc.close();
	}

}
