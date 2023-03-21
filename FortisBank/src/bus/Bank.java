package bus;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String numberBank; // identifiant de la succursale
	private String bankName; // Fortis Bank 
	private String address; // l adresse de la banque
	private ZIPCODE zipcode; 
	private EnumStatus status;  // statut de la banque
	private double balance;

	
	
	//  getter and setter
	//-------------------------------------------
	public String getNumberBank() {
		return numberBank;
	}
	public void setNumberBank(String numberBank) {
		this.numberBank = numberBank;
	}
	//-------------------------------------------
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	//-------------------------------------------
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//-------------------------------------------
	public ZIPCODE getZipcode() {
		return zipcode;
	}
	public void setZipcode(ZIPCODE zipcode) {
		this.zipcode = zipcode;
	}
	//-------------------------------------------
	public EnumStatus getStatut() {
		return status;
	}
	public void setStatut(EnumStatus status) {
		this.status = status;
	}
	//-------------------------------------------

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//-------------------------------------------

	// constructeur par default
	public Bank() {
		this.numberBank = "Undefined";
		this.bankName ="Undefined";
		this.address ="Undefined";
		this.zipcode = new ZIPCODE();
		this.status = EnumStatus.Undefined;
		this.balance = 0.00;
	}
	
	// copie du constructeur
	public Bank(Bank newBank) {
		this.numberBank = newBank.numberBank;
		this.bankName = newBank.bankName;
		this.address = newBank.address;
		this.zipcode = newBank.zipcode;
		this.status = newBank.status;
		this.balance = newBank.balance;
	}
	
	// constructeur avec parametres
	public Bank(String numberBank, String bankName, String address, ZIPCODE zipcode, EnumStatus statut,double balance) {
		super();
		this.numberBank = numberBank;
		this.bankName = bankName;
		this.address = address;
		this.zipcode = zipcode;
		this.status = statut;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return String.format("Bank [numberBank=%s,bankName=%s,address=%s,zipcode=%s,status=%s,balance=%.2f]",
							numberBank,bankName,address,zipcode,status,balance);
	}
	/*
	@Override
	public String toString() {
	    return String.format("Bank [numberBank=%s, bankName=%s, address=%s, status=%s, balance=%.2f]",
	                         numberBank, bankName, address, status, balance);
	}*/
	
	/* Le constructeur par défaut initialise les attributs avec des valeurs par défaut, 
	 * tandis que le constructeur avec paramètres permet de les initialiser avec 
	 * des valeurs fournies.*/
}
