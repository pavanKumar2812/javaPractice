package main;

public class Atm {

	private double balance;
	private double depositeAmount;
	private double withDrawAmount;
	
//	public Atm(){
//		
//	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double amount) {
		this.balance = amount;
	}
	public double getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(double depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public double getWithDrawAmount() {
		return withDrawAmount;
	}
	public void setWithDrawAmount(double amount) {
		this.withDrawAmount = amount;
	}
	
	

}
