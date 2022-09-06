package entities;

public class productv2 {

		public String name;
		public double price; 
		public int quantity;
		
		// geralmente os construtores entram depois dos atributos e antes dos métodos
		
		public productv2 (String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public productv2 (String name, double price) {
			this.name = name;
			this.price = price;
		}
		
		public double totalValueInStock() {
			return price * quantity;
		}
		
		public void addProducts(int quantity) {
			this.quantity += quantity; // acessar o atributo da classe e não esse parâmetro
		} 
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		public String toString() {
			return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
		}
}
