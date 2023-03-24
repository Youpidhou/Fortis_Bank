package bus;

/**
 * 
 * @author Miguel Beauchemin
 * @author Dominic Potvin
 */
public class Bank {

	// Attributes
	private String numberBank;
	private String bankName;
	private String address;
	private Zipcode zipcode;
	private EnumStatus status;
	private double balance;
	
	// Getters and setters for numberBank
	public String getNumberBank() {
		return numberBank;
	}
	public void setNumberBank(String numberBank) {
		this.numberBank = numberBank;
	}
	
	// Getters and setters for bankName
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	// Getters and setters for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// Getters and setters for zipcode
	public Zipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(Zipcode zipcode) {
		this.zipcode = zipcode;
	}
	
	// Getters and setters for status
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	// Getters and setters for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Constructors
	/**
	 * Default constructor sets all attributes to undefined values.
	 */
	public Bank() {
		this.numberBank = "Undefined";
		this.bankName = "Undefined";
		this.address = "Undefined";
		this.zipcode = new Zipcode();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
	}
	
	/**
	 * Copy constructor creates a new Bank object with the same attributes as the given Bank object.
	 * @param newBank The Bank object to copy.
	 */
	public Bank(Bank newBank) {
		this.numberBank = newBank.numberBank;
		this.bankName = newBank.bankName;
		this.address = newBank.address;
		this.zipcode = newBank.zipcode;
		this.status = newBank.status;
		this.balance = newBank.balance;
	}
	
	/**
	 * Constructor creates a new Bank object with the given attributes.
	 * @param numberBank The bank number.
	 * @param bankName The name of the bank.
	 * @param address The address of the bank.
	 * @param zipcode The ZIPCODE object representing the bank's ZIP code.
	 * @param status The status of the bank.
	 * @param balance The current balance of the bank.
	 */
	public Bank(String numberBank, String bankName, String address, Zipcode zipcode, EnumStatus status, double balance) {
		this.numberBank = numberBank;
		this.bankName = bankName;
		this.address = address;
		this.zipcode = zipcode;
		this.status = status;
		this.balance = balance;
	}
	
	// Method to display the information of the current object as a string
	/**
	 * Returns a string representation of this Bank object.
	 */
	@Override
	public String toString() {
		return String.format("Bank [numberBank=%s, bankName=%s, address=%s, zipcode=%s, status=%s, balance=%.2f]", numberBank, bankName, address, zipcode, status, balance);
	}
}
