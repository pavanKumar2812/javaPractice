package main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		AtmOperatorInterf op = new AtmOperationImplement();
		
		int Atmnumber = 292717;
		int pin = 2869;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to JAFA ATM Machine :)");
		System.out.println("Enter the ATM number: ");
		int userEnterAN = sc.nextInt();
		System.out.println("Enter the PIN: ");
		int userEnterPin = sc.nextInt();
		
		if( (Atmnumber == userEnterAN) && (pin == userEnterPin)) {
			while(true) {
				System.out.println("1. View Balance \n 2. With Draw Amount \n 3. Deposite Amount \n 4. View MiniStatement \n 5. Exit");
				System.out.println("Enter the choice : ");
				int ch = sc.nextInt();
				if(ch == 1) {
					op.viewBalance();
				} else if(ch == 2) {
					System.out.println("Enter amount to withdraw :");
					double withDrawAmount = sc.nextDouble();
					op.withDrawAmount(withDrawAmount);
				} else if(ch == 3) {
					System.out.println("Enter amount to deposite : ");
					double depositeAmount = sc.nextDouble();
					op.depositeAmount(depositeAmount);
				} else if(ch == 4) {
					op.viewMiniStatement();
				} else if(ch == 5) {
					System.out.println("collect your ATM Card \n Thank You for using me :)");
					System.exit(0);
				} else {
					System.out.println("Incorrect ATM Number or PIN please check... :(");
				}
			}
		} else {
			System.out.println("Enter valid choices... :(");
			System.exit(0);
		}
	}

}
