package bus;



public class Account {
	private String accountNumber; // Numéro du compte
	private Date dateOfOpening; // Date d'ouverture du compte
	private String status; // Statut du compte (actif ou fermé)		
	private double balance; // Solde du compte
	private EnumAccountType accountType; // Type de compte
	private Transaction transaction;

	
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

	public void setDateOfOpening(Date dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	//-------------------------------------
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	// constructeur // 
	public Account() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.status = "Undefined";
		this.balance = 0.00;
		this.accountType = EnumAccountType.Checking;
		this.transaction = new Transaction();
		
	}

	// copie du constructeur // 
	public Account(Account newAccount) {
		this.accountNumber = newAccount.accountNumber;
		this.dateOfOpening = newAccount.dateOfOpening;
		this.status = newAccount.status;
		this.balance = newAccount.balance;
		this.accountType = newAccount.accountType;
		this.transaction = newAccount.transaction;
	}

	// constructeur avec tous les parametres
	public Account(String accountNumber, Date dateOfOpening, String status, double balance,
			EnumAccountType accountType, Transaction transaction) {
		super();
		this.accountNumber = accountNumber;
		this.dateOfOpening = dateOfOpening;
		this.status = status;
		this.balance = balance;
		this.accountType = accountType;
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", status=" + status
				+ ", balance=" + balance + ", accountType=" + accountType + ", transaction=" + transaction + "]";
	}


}
