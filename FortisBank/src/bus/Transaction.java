package bus;


public class Transaction implements ITransactionnable {
	
	// instance variables
	private int transactionNumber;
	private String description;
	private Date dateTransaction;
	private double amount;
	private EnumTransactionType transType;
	
	
	// Getter and Setter for transaction
	public int getTransaction() {
		return transactionNumber;
	}
	public void setTransaction(int transaction) {
		this.transactionNumber = transaction;
	}
	
	// Getter and Setter for description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Getter and Setter for dateTransaction
	public Date getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	
	// Getter and Setter for amount
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	// Getter and Setter for transType
	public EnumTransactionType getTransType() {
		return transType;
	}
	
	public void setTransType(EnumTransactionType transType) {
		this.transType = transType;
	}
	
	//---------------------	 constructors  ---------------------	
	/**
	 * Default constructor for Transaction, initializes all fields to default values.
	 */
	public Transaction() {
		this.transactionNumber = 0;
		this.description = "Undefined";
		this.dateTransaction = new Date();
		this.amount = 0.00;
		this.transType = EnumTransactionType.Undefined;
	}
	
	/**
	 * Copy constructor for Transaction, copies the values of another Transaction object.
	 * @param newTransaction the Transaction object to copy
	 */
	public Transaction(Transaction newTransaction) {
		this.transactionNumber = newTransaction.transactionNumber;
		this.description = newTransaction.description;
		this.dateTransaction = newTransaction.dateTransaction;
		this.amount = newTransaction.amount;
		this.transType = newTransaction.transType;
	}
	
	/**
	 * Constructor for Transaction with parameters.
	 * @param transaction the transaction number
	 * @param description the transaction description
	 * @param dateTransaction the transaction date
	 * @param amount the transaction amount
	 * @param transType the transaction type
	 */
	public Transaction(int transaction, String description, Date dateTransaction, double amount, EnumTransactionType transType) {
		this.transactionNumber = transaction;
		this.description = description;
		this.dateTransaction = dateTransaction;
		this.amount = amount;
		this.transType = transType;
	}
	
	/**
	 * Returns a string representation of this Transaction object.
	 */
	@Override
	public String toString() {
		return "Transaction [transaction=" + transactionNumber + ", description=" + description + ", dateTransaction="
				+ dateTransaction + ", amount=" + amount + ", transType=" + transType + "]";
	}	
}
