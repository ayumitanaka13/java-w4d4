package ca.java.project;

import java.util.ArrayList;
// import java.util.Date;

public class User {

	private String firstName;
	private String lastName;
	private String postalCode;
	private String phoneNumber;
	// private Date dob;
	private ArrayList<BankAccount> accounts;
	
	
	
	//CONSTRUCTOR
	
	public User(String firstName, String lastName, String postalCode, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNumber);
		this.accounts = new ArrayList<BankAccount>();
	}
	
	
	
	//GETTER
	
	/*
	 * @ return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @ return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @ return postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/*
	 * @ return postalCode
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/*
	 * @ return ArrayList<BankAccount> BankAccounts
	 */
	public ArrayList<BankAccount> getBankAccounts() {
		return accounts;
	}
	
	
	
	// SETTER
	
	/*
	 * @param  firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	/*
	 * @param  lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	/*
	 * @param  postalCode
	 */
	public void setPostalCode(String postalCode) {
		if (!postalCode.isEmpty() && !postalCode.equalsIgnoreCase(null)) {
			this.postalCode = postalCode;
		} else {
			this.postalCode = "Unknown";
		}
	}
	/*
	 * @param  phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";
		} 
	}
	/*
	 * @param BankAccount b to populate the arrayList accounts
	 */
	public void addBankAccount(BankAccount b) {
		this.accounts.add(b);
	}
	
	@Override
	public String toString() {
		return 	"User Information" +
				"\nUser name : " + firstName + " " + lastName +
				"\nPostal code : " + postalCode +
				"\nPhone number : " + phoneNumber;
	}
}

