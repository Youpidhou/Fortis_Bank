package temp;



public abstract class SavingAccount implements Account{
	private String accountNumber;
	private Date dateOfOpening;
	private double balance;
	private int transaction;
	private String status;
	private EnumAccountType accountType;

	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}	
    public Date getDateOfOpening() {
        return dateOfOpening;
    }
    public void setDateOfOpening(Date dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    } 
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
	public int getTransaction() {
		return transaction;
	}
	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public EnumAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(EnumAccountType accountType) {
        this.accountType = accountType;
    }

    
	// --------  Constructeurs par default
	public SavingAccount() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.balance = 0.00;
		this.transaction = 0;
        this.status = "Undefined";
        this.accountType = EnumAccountType.Undefined;
		
	}
	
	// --------  Constructeurs avec parametres
	
	public SavingAccount(String accountNumber, Date dateOfOpening, double balance, int transaction, String status,
			EnumAccountType accountType) {
		super();
		this.accountNumber = accountNumber;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
		this.transaction = transaction;
		this.status = status;
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + ", transaction=" + transaction + ", status=" + status + ", accountType=" + accountType
				+ "]";
	}
	
}
