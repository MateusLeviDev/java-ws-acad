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
		 *  int y = obj * 2; [não precisaria colocar casting]
		 * 
		 *  System.out.println(y);
		 *  
		 *  Ou seja, as wrapper são classes que tem o objetivo de tratar os tipos primitivos como classe só que deve forma 
		 *  transparente ao compilador, não se preocupando em fazer conversões e castings. 
		 *  
		 *  Tipo primitivo não aceita valor null. Já o wrapper naturalmente aceita. 
		 */
		
		
	}

}
