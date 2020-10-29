package ca.java.project;

public class BankAccount {
	
	private int accountNumber;
	private double balance;
	private int createdYear;
	private int createdMonth;

	
	
	//CONSTRUCTOR
	
	public BankAccount(double balance, int createdYear, int createdMonth) {
		setAccountNumber();
		setBalance(balance);
		setCreatedYear(createdYear);
		setCreatedMonth(createdMonth);
	}
	

	
	//GETTER
	
	/*
	 * @ return accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/*
	 * @ return balance
	 */
	public double getBalance() {
		return balance;
	}
	/*
	 * @ return createdYear
	 */
	public int getCreatedYear() {
		return createdYear;
	}
	/*
	 * @ return createdYear
	 */
	public int getCreatedMonth() {
		return createdMonth;
	}

	
	
	
	// SETTER

	/*
	 *  Set accountNumber
	 */
	public void setAccountNumber() {	
		int randomNumber = (int)((Math.random()*9001)+1000);
		this.accountNumber = randomNumber;
	}
	/*
	 * @param  balance
	 */
	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}	
	}
	/*
	 * @param  createdYear
	 */
	public void setCreatedYear(int createdYear) {
		if (createdYear > 1900) {
			this.createdYear = createdYear;
		} else {
			this.createdYear = 1900;
		}		
	}
	/*
	 * @param  createdMonth
	 */
	public void setCreatedMonth(int createdMonth) {
		if (createdMonth > 0 && createdMonth < 13) {
			this.createdMonth = createdMonth;
		} else {
			this.createdMonth = 1;
		}		
	}
	
	/*
	 * @param depositAmount
	 */
	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			balance += depositAmount;
		} else {
			System.err.println("Deposit Amount should be more then zero.");
		}
	}
	/*
	 * @param withdrawAmount
	 */
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > 0 && withdrawAmount <= balance) {
			balance -= withdrawAmount;
		} else if (withdrawAmount < 0) {
			System.err.println("Withdraw amount should be more than zero.");
		} else if (withdrawAmount > balance) {
			System.err.println("Withdraw amount should be less than your balance.");
		}
	}
	
	@Override
	public String toString() {
		return  "Account Number :" + accountNumber +
				"\nBalance : " + balance +
				"\nCreated Year : " + createdYear +
				"\nCreated Month : " + createdMonth;
	}	
}
