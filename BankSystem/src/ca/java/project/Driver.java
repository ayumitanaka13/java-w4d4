package ca.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	// printInformation method
	public static void printInformation(User u) {
		System.out.println(u.toString());
		System.out.println();
		System.out.println("The Bank Accounts List of "
				+ u.getFirstName() + " " + u.getLastName());
		System.out.println();
		
		for (BankAccount b : u.getBankAccounts()) {
			System.out.println(b.toString());
		}
	}
	
	// checkPostalCode method
	public static User checkPostalCode(ArrayList<User> users, String postalCode) {
		for (User u : users) {
			if(u.getPostalCode().equalsIgnoreCase(postalCode)) {
				return u;
			}
		}
		return null;
	}
	
	public static User getUser(ArrayList<User> users) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your postal code in the format of AAA AAA :");
		String pCode = input.nextLine();
		User returnedUser = checkPostalCode(users, pCode);
		
		while(returnedUser == null) {
			System.err.println("There is no user with this postal code. \nPlease enter your postal code in the format of AAA AAA :");
			pCode = input.nextLine();
			returnedUser = checkPostalCode(users, pCode);
		}
		return returnedUser;
	}
	
	// printInstruction method (option)
	public static int printInstruction() {
		Scanner input = new Scanner(System.in);		
		System.out.println("Choose your option :");
		System.out.println("1. deposit, 2. withdraw, 3. quit");
		return input.nextInt();
	}
	
	// getBankAccountFromUser method
	public static BankAccount getBankAccountFromUser(User u) {
		Scanner input = new Scanner(System.in);
		
		BankAccount account = null;
		while(account == null) {	
			System.out.println("Enter your account number");
			int accNumEntered = input.nextInt();			
			for (BankAccount b : u.getBankAccounts()) {
				if(b.getAccountNumber() == accNumEntered) {
					account = b;
				}
			}
		}
		return account;
	}
	
	// getAmountFromUser method
	public static double getAmountFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount that you want to do the transaction");
		return input.nextDouble();
	}
	
	public static void doTransaction(User u) {
		int option = printInstruction();
		
		while(option != 3) {
			switch(option) {
			case 1:
				BankAccount depositAccount = getBankAccountFromUser(u);
				double depositAmount = getAmountFromUser();
				depositAccount.deposit(depositAmount);
				printInformation(u);
				break;
			case 2:
				BankAccount withdrawAccount = getBankAccountFromUser(u);
				double withdrawAmount = getAmountFromUser();
				withdrawAccount.withdraw(withdrawAmount);
				printInformation(u);
				break;
			default:
				System.out.println("wrong option.");
			}
			System.out.println();
			option = printInstruction();
		}
		System.out.println("Thank you. See you later.");

	}

	// main method
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		Scanner input = new Scanner(System.in);
		
		// Create BankAccount Objects
		BankAccount b1 = new BankAccount(1000, 1993, 12);
		BankAccount b2 = new BankAccount(600.5, 2015, 3);
		BankAccount b3 = new BankAccount(-100, 1830, 0);
		// Create User Object
		User u1 = new User("Ayumi", "Tanaka", "ABC 123", "123-456-789");
		// Populate the list of BankAccounts
		u1.addBankAccount(b1);
		u1.addBankAccount(b2);
		u1.addBankAccount(b3);
		
		users.add(u1);
		
		User returnedUser = getUser(users);
		
		System.out.println();
		printInformation(returnedUser);
		System.out.println();
		
		doTransaction(returnedUser);
	}
	
}