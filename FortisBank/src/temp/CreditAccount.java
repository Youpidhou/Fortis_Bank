package temp;

public abstract class CreditAccount implements IAccount {
		
		private String accountNumber;
		private Date dateOfOpening;
		private double balance;
		private int transaction;
		private String status;

	
	// -- Getter and Setter
	// -------------------------------------
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

	
	// default constructor		
	public CreditAccount() {
		this.accountNumber = "Undefined";
		this.dateOfOpening = new Date();
		this.balance = 0.00;
		this.transaction = 0;
        this.status = "Undefined";
		
	}
	
	// --------  Constructeurs avec parametres
	
	public CreditAccount(String accountNumber, Date dateOfOpening, double balance, int transaction, String status){
		super();
		this.accountNumber = accountNumber;
		this.dateOfOpening = dateOfOpening;
		this.balance = balance;
		this.transaction = transaction;
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "CreditAccount [accountNumber=" + accountNumber + ", dateOfOpening=" + dateOfOpening + ", balance="
				+ balance + ", transaction=" + transaction + ", status=" + status +  "]";
	}
		
}
