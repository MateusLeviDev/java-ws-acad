package java_ude_alu;

import java.util.Scanner;

public class java_classes02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}

}
