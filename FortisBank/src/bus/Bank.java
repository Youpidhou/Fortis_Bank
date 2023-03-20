package bus;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String numberBank; // identifiant de la succursale
	private String bankName; // Fortis Bank 
	private String address; // l adresse de la banque
	private String status;  // statut de la banque
	private double balance;
	private ZIPCODE zipcode; // ajouter get set
	
	
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
	public String getStatut() {
		return status;
	}
	public void setStatut(String status) {
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
		this.status ="Undefined";
		this.balance = 0.00;
	}
	
	
	// constructeur avec parametres
	public Bank(String numberBank, String bankName, String address, String statut,double balance) {
		super();
		this.numberBank = numberBank;
		this.bankName = bankName;
		this.address = address;
		this.status = statut;
		this.balance = balance;
	}
	
	
	@Override// affiche les informations da la succursale de la banque
	public String toString() {
		return "Bank [numberBank=" + numberBank + ", bankName=" + bankName + ", address=" + address + ", status="
				+ status + ", balance=" + balance + "]";
	}
	/* Le constructeur par défaut initialise les attributs avec des valeurs par défaut, 
	 * tandis que le constructeur avec paramètres permet de les initialiser avec 
	 * des valeurs fournies.*/
}
