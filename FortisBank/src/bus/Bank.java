package bus;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	// Attributes
	private String numberBank;
	private String bankName;
	private String address;
	private ZIPCODE zipcode;
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
	public ZIPCODE getZipcode() {
		return zipcode;
	}
	public void setZipcode(ZIPCODE zipcode) {
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
	public Bank() {
		this.numberBank = "Undefined";
		this.bankName = "Undefined";
		this.address = "Undefined";
		this.zipcode = new ZIPCODE();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
	}
	
	public Bank(Bank newBank) {
		this.numberBank = newBank.numberBank;
		this.bankName = newBank.bankName;
		this.address = newBank.address;
		this.zipcode = newBank.zipcode;
		this.status = newBank.status;
		this.balance = newBank.balance;
	}
	
	public Bank(String numberBank, String bankName, String address, ZIPCODE zipcode, EnumStatus status, double balance) {
		this.numberBank = numberBank;
		this.bankName = bankName;
		this.address = address;
		this.zipcode = zipcode;
		this.status = status;
		this.balance = balance;
	}
	
	// Method to display the information of the current object as a string
	@Override
	public String toString() {
		return String.format("Bank [numberBank=%s, bankName=%s, address=%s, zipcode=%s, status=%s, balance=%.2f]", numberBank, bankName, address, zipcode, status, balance);
	}
}
