package application;

import java.util.Locale;
import java.util.Scanner;

import entitie.Operations;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Operations account;
		
		System.out.printf("Enter the account number:" );
		int accountNumber = sc.nextInt();
		System.out.printf("Enter the account holder:" );
		sc.nextLine();
		String accountName = sc.next();
		
		System.out.printf("Is there an initial deposit? (y/n)");
		char initialDepositConfirmation = sc.next().charAt(0);
		
		if( initialDepositConfirmation == 'y') {
			
			System.out.printf("Enter the initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new Operations(accountNumber,accountName,initialDeposit);
			
		}else {
			account = new Operations(accountNumber,accountName);	
		}
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double valueOperator = sc.nextDouble();
		account.deposit(valueOperator);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		valueOperator = sc.nextDouble();
		account.withdraw(valueOperator);
		System.out.println();
		
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		
		sc.close();
		
		
	}

}
