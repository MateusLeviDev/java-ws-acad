package java_ude_alu;

import java.util.Scanner;

public class java_classes03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		double price = 400;
		
		double discount;
		
		if (price < 200) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		System.out.println(discount);

	}

}
