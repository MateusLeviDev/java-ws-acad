import java.util.Locale;
import java.util.Scanner;
public class exemplojava05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qte1, qte2;
	    double preco1, preco2, total;
	    
	    sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();
	    
	    total = preco1 * qte1 + preco2 * qte2;
	    
	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	    
	    sc.close();
	    

	}

}
