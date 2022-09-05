package entities;

public class triangle {

	public double a;
	public double b;
	public double c; 
	
	// criando agora um método uma função para calcular a área.
	
	public double area() {
		double p = (a + b + c)/2.0;  // trabalhando com os atributos da classe. 
		double result = Math.sqrt(p * (p - a)*(p - b)*(p - c));
		return Math.sqrt(p * (p - a)*(p - b)*(p - c));
	}
}
