package java_ude_alu;
import java.util.Scanner;
public class java_classes09 {

	public static void main(String[] args) {
		
		/* String s = "potato apple lemon";
		
		 String[] vect = s.split(" ");
		
		 System.out.println(vect[0]);
		 System.out.println(vect[1]);
		 System.out.println(vect[2]);
		
		 String word1 = vect[0];
		 String word2 = vect[1];
		 String word3 = vect[2]; */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
		}
		
		public static int max(int x, int y, int z) {
			int aux;
			if (x > y && x > z) {
				aux = x;
			} else if (y > z) {
				aux = y;
			} else {
				aux = z;
			}
			return aux;
			}
			
		public static void showResult(int value) {
			System.out.println("Higher = " + value);
		
		}
		
	}


