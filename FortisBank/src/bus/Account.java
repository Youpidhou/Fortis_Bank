package bus;

import java.util.Date;

public class Account {
	private String accountNumber;
	private TypeAccount accountType;
	private Date dateOfBirth;
	private double balance;

	
// -- Getter and Setter
// -------------------------------------
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
// -------------------------------------
	
	public TypeAccount getAccountType() {
		return accountType;
	}
	public void setAccountType(TypeAccount accountType) {
		this.accountType = accountType;
	}
	
// -------------------------------------

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
// -------------------------------------

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
// -------------------------------------
	
	
	
}
