package bus;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String accountNumber; // Numéro du compte
	private Date dateOfOpening; // Date d'ouverture du compte
	private EnumAccountType accountType; // Type de compte
	private EnumStatus status;// Statut du compte (actif ou fermé)
	private double balance; // Solde du compte
	private List<Transaction> transactions;

	
	//-------------------------------------
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	//-------------------------------------
	public Date getDateOfOpening() {
		return dateOfOpening;
	}

	public void setDateOfOpening(Date i) {
		this.dateOfOpening = i;
	}
	//-------------------------------------  
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	//-------------------------------------

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//-------------------------------------

	public EnumAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(EnumAccountType accountType) {
		this.accountType = accountType;
	}
	//-------------------------------------	

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);    }

	//-------------------------------------
    
	public List<Transaction> getTransactions() {
		return transactions;
	}
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
	//-------------------------------------
    




	// constructeur // 
	public Account() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
		this.accountType = EnumAccountType.Checking;
		this.transactions = new ArrayList<>();
		
	}

	// copie du constructeur // 
	public Account(Account newAccount) {
		this.accountNumber = newAccount.accountNumber;
		this.dateOfOpening = newAccount.dateOfOpening;
		this.status = newAccount.status;
		this.balance = newAccount.balance;
		this.accountType = newAccount.accountType;
		this.transactions = newAccount.transactions;
	}

	// constructeur avec tous les parametres
	public Account(String accountNumber, Date dateOfOpening, EnumStatus status, double balance, EnumAccountType accountType,
			List<Transaction> transactions) {
		super();
		this.accountNumber = accountNumber;
		this.dateOfOpening = dateOfOpening;
		this.status = status;
		this.balance = balance;
		this.accountType = accountType;
		this.transactions = transactions;
	}
	

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", status=" + status
				+ ", balance=" + balance + ", accountType=" + accountType + ", transactions=" + transactions + "]";
	}


}
