package bus;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private String numberBank; // identifiant de la succursale
	private String bankName; // Fortis Bank 
	private String address; // l adresse de la banque
	private String statut;  // statut de la banque
	private List<Client> client;
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
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	//-------------------------------------------
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	//-------------------------------------------
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//-------------------------------------------
	
	
	// methode ajouter un clients a la banque
	
    public void addClient(Client client) {
        this.client.add(client);
    }
    // methode supprimer les clients de la banque
    public boolean removeClient(Client client) {
        return this.client.remove(client);
    }    
    
    // methode pour rechercher un client
    public Client findClient(String clientId) {
        for (Client client : this.client) {
            if (client.getClientId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }
    
	//-------------------------------------------
    
    
	// constructeur par default
	public Bank() {
		this.numberBank = "Undefined";
		this.bankName ="Undefined";
		this.address ="Undefined";
		this.statut ="Undefined";
		this.client = new ArrayList<Client>();
		this.balance = 0.00;
	}
	
	
	// constructeur avec parametres
	public Bank(String numberBank, String bankName, String address, String statut, List<Client> client,
			double balance) {
		super();
		this.numberBank = numberBank;
		this.bankName = bankName;
		this.address = address;
		this.statut = statut;
		this.client = client;
		this.balance = balance;
	}
	/* Le constructeur par défaut initialise les attributs avec des valeurs par défaut, 
	 * tandis que le constructeur avec paramètres permet de les initialiser avec 
	 * des valeurs fournies.*/
	
	
	@Override// affiche les informations da la succursale de la banque
	public String toString() {
		return "Bank [numberBank=" + numberBank + ", bankName=" + bankName + ", address=" + address + ", statut="
				+ statut + ", client=" + client + ", balance=" + balance + "]";
	}		
	
}
