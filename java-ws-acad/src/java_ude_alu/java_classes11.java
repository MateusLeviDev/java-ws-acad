package java_ude_alu;

public class java_classes11 {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);  //boxing, unboxing 
		
		int y = (int) obj;
		
		System.out.println(y);
		
		/*
		 *  Interger obj = x;
		 *  
		 *  int y = obj * 2; [n�o precisaria colocar casting]
		 * 
		 *  System.out.println(y);
		 *  
		 *  Ou seja, as wrapper s�o classes que tem o objetivo de tratar os tipos primitivos como classe s� que deve forma 
		 *  transparente ao compilador, n�o se preocupando em fazer convers�es e castings. 
		 *  
		 *  Tipo primitivo n�o aceita valor null. J� o wrapper naturalmente aceita. 
		 */
		
		
	}

}
