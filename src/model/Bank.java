package model;


/**
 * @author Fernando Garcia - fggarcia
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class Bank {
	private int accountId;
	private String fName;
	private String lName;
	private double balance;
	private Boolean overdrawFlag;
	
	public Bank() {}

	public Bank(int accountId, String fName, String lName, double balance) {
		super();
		this.accountId = accountId;
		this.fName = fName;
		this.lName = lName;
		this.balance = balance;
		this.overdrawFlag = false;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		this.balance = balance - amount;
		checkOverdraw();
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	
	public Boolean checkOverdraw() {
		if (this.balance < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
