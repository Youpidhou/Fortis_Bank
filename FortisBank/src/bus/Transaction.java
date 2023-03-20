package bus;

public class Transaction implements ITransaction {
	
	private int transactionNumber;
	private String description;
	private Date dateTransaction;
	private double amount;
	private EnumTransactionType transType;
	
	
	// getter and setter
	public int getTransaction() {
		return transactionNumber;
	}
	public void setTransaction(int transaction) {
		this.transactionNumber = transaction;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public EnumTransactionType getTransType() {
		return transType;
	}
	public void setTransType(EnumTransactionType transType) {
		this.transType = transType;
	}
	
	
	// constructeur sans parametre
	public Transaction() {
		this.transactionNumber = 0;
		this.description = "Undefined";
		this.dateTransaction = new Date();
		this.amount = 0.00;
		this.transType = EnumTransactionType.Undefined;
	}
	
	// copie du constructeur
	public Transaction(Transaction newTrasaction) {
		this.transactionNumber = newTrasaction.transactionNumber;
		this.description = newTrasaction.description;
		this.dateTransaction = newTrasaction.dateTransaction;
		this.amount = newTrasaction.amount;
		this.transType = newTrasaction.transType;
	}
	
	// constructeur avec parametres
	public Transaction(int transaction, String description, Date dateTransaction, double amount,
			EnumTransactionType transType) {
		super();
		this.transactionNumber = transaction;
		this.description = description;
		this.dateTransaction = dateTransaction;
		this.amount = amount;
		this.transType = transType;
	}
	
	
	@Override
	public String toString() {
		return "Transaction [transaction=" + transactionNumber + ", description=" + description + ", dateTransaction="
				+ dateTransaction + ", amount=" + amount + ", transType=" + transType + "]";
	}	
	
}
