package main;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImplement  implements AtmOperatorInterf{
	
	Atm atm = new Atm();
	
	Map<Double,String> ministmt = new HashMap<>();
	
	@Override
	public void viewBalance() {
		System.out.println("Available balance is : "+atm.getBalance());
	}

	@Override
	public void withDrawAmount(double withdrawAmount) {
		if( withdrawAmount%500 == 0 ) {
			if( withdrawAmount <= atm.getBalance() ) {
				ministmt.put(withdrawAmount," Amount withdrawn");
				System.out.println("Collect the cash "+withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
			} else {
				System.out.println("Insufficient Balance :( ");
			}
		} else {
			System.out.println("Please enter the amount in multiple of 500 rupees notes...");
		}
	}

	@Override
	public void depositeAmount(double depositeAmount) {
		ministmt.put(depositeAmount, " Deposited Amount");
		System.out.println(depositeAmount+" Deposited Successfully :)");
		atm.setBalance(atm.getBalance()+ depositeAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double,String> m: ministmt.entrySet()) {
			System.out.println(m.getKey()+m.getValue());
		}
		
	}

}
