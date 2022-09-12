package entities;

public class Account {

		private int number;
		private String holder; 
		private double balance;
		
		// esse construtor recebrá o número da conta e o titular. 
		public Account(int number, String holder) {
			this.number = number;
			this.holder = holder;
		}

		public Account(int number, String holder, double initialDeposit) {
			this.number = number;
			this.holder = holder;
			deposit(initialDeposit);
		} 
		// como os atributos são privados, deverá ser feito o get e set

		public int getNumber() {
			return number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}
		
		public void deposit(double amount) {
			balance += amount; 
		}
		
		public void withdraw(double amount) {
			balance -= amount + 5.0;
		}
		
		public String toString() { 
			return "Account " +
					number + 
					", " +
					", holder: " +
					holder +
					", balance: R$" +
					String.format("%.2f", balance);
		}
}
