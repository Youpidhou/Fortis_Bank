package bus;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Miguel Beauchemin
 * @author Dominic Potvin
 */
public class Account extends Transaction{
	
	// Attributes
	private String accountNumber; 
	private Date dateOfOpening; 
	private EnumAccountType accountType; 
	private EnumStatus status; 
	private double balance; 
	private List<Transaction> transactions; 

	// Getter and setter for accountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Getter and setter for dateOfOpening
	public Date getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(Date i) {
		this.dateOfOpening = i;
	}

	// Getter and setter for status
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	// Getter and setter for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter and setter for accountType
	public EnumAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(EnumAccountType accountType) {
		this.accountType = accountType;
	}

	/**
	 * Adds a transaction to the list of transactions for the account.
	 *
	 * @param transaction the transaction to be added to the list of transactions
	 */
	public void addTransaction(Transaction transaction) {
	    this.transactions.add(transaction);
	}

	// Getter and setter for transactions
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
	    this.transactions = transactions;
	}

	/**
	 * Withdraws the specified amount from the account, if possible.
	 *
	 * @param amount the amount to withdraw from the account
	 * @return true if the withdrawal was successful, false otherwise
	 */
	public boolean Withdraw(double amount) {
	    if (this.balance >= amount) {
	        this.balance -= amount;
	        return true;
	    }
	    return false;
	}

	/**
	 * Constructs an Account object with default attribute values.
	 */
	public Account() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
		this.accountType = EnumAccountType.Checking;
		this.transactions = new ArrayList<>();
	}

	/**
	 * Constructs a copy of the specified Account object.
	 *
	 * @param newAccount the account to be copied
	 */
	public Account(Account newAccount) {
		this.accountNumber = newAccount.accountNumber;
		this.dateOfOpening = newAccount.dateOfOpening;
		this.status = newAccount.status;
		this.balance = newAccount.balance;
		this.accountType = newAccount.accountType;
		this.transactions = newAccount.transactions;
	}

	/**
	 * Constructs an Account object with the specified attribute values.
	 *
	 * @param accountNumber the account number
	 * @param dateOfOpening the date of opening
	 * @param status the status of the account (active or closed)
	 * @param balance the balance of the account
	 * @param accountType the account type
	 * @param transactions the list of transactions for the account
	 */
	public Account(String accountNumber, Date dateOfOpening, EnumStatus status, double balance, EnumAccountType accountType, List<Transaction> transactions) {
			this.accountNumber = accountNumber;
			this.dateOfOpening = dateOfOpening;
			this.status = status;
			this.balance = balance;
			this.accountType = accountType;
			this.transactions = transactions;
	}	

	// Method to display the information of the current object as a string
	/**
	 * Returns a string representation of this Account object.
	 */
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", status=" + status
				+ ", balance=" + balance + ", accountType=" + accountType + ", transactions=" + transactions + "]";
	}
}