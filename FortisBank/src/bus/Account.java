package bus;

import java.util.ArrayList;
import java.util.List;

public class Account extends Transaction {
	
	// Attributes
	private String accountNumber; // Account number
	private Date dateOfOpening; // Date of opening
	private EnumAccountType accountType; // Account type
	private EnumStatus status; // Status of the account (active or closed)
	private double balance; // Balance of the account
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
	
	// Method to add a transaction to the list of transactions
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
    
    // Method to withdraw money from the account
    public boolean Withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

	// Constructor
	public Account() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
		this.accountType = EnumAccountType.Checking;
		this.transactions = new ArrayList<>();
	}

	// Copy constructor
	public Account(Account newAccount) {
		this.accountNumber = newAccount.accountNumber;
		this.dateOfOpening = newAccount.dateOfOpening;
		this.status = newAccount.status;
		this.balance = newAccount.balance;
		this.accountType = newAccount.accountType;
		this.transactions = newAccount.transactions;
	}

	// Constructor with all parameters
	public Account(String accountNumber, Date dateOfOpening, EnumStatus status, double balance, EnumAccountType accountType,
			List<Transaction> transactions) {
		this.accountNumber = accountNumber;
		this.dateOfOpening = dateOfOpening;
		this.status = status;
		this.balance = balance;
		this.accountType = accountType;
		this.transactions = transactions;
	}	

	// Method to display the information of the current object as a string
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", status=" + status
				+ ", balance=" + balance + ", accountType=" + accountType + ", transactions=" + transactions + "]";
	}
}
