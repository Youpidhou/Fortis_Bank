package bus;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
	
	private String managerID;
	private List<Client> clients; // créer un nouveau client
	private List<Account> accounts;
	
	// getter et setter
	public String getManagerID() {
		return managerID;
	}
	
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	
	//---------------Clients ----------------------
	
	// cree liste de client
	public List<Client> getClients() {
		return clients;
	}
	
	// Définition de la liste de clients pour le gestionnaire de banque
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	// Ajout du client à la liste de clients du gestionnaire de banque
    public void addClient(Client client) {
        this.clients.add(client);
    }
    
    // suppression du client à la liste de clients du gestionnaire de banque
    public boolean removeClient(Client client) {
        return this.clients.remove(client);
    }    
    
    // trouve le client dans la liste de clients du gestionnaire de banque
    public Client findClient(String clientId) {
        for (Client client : this.clients) {
            if (client.getClientId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }

    // Méthode pour ajouter un compte à un client
    public void addAccount(String clientId, Account account) {
        Client client = findClient(clientId);
        if (client != null) {
            client.getAccounts().add(account);
        }
    }

    // Méthode pour supprimer un compte d'un client
    public boolean removeAccount(String clientId, String accountNumber) {
        Client client = findClient(clientId);
        if (client != null) {
            for (Account account : client.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return client.getAccounts().remove(account);
                }
            }
        }
        return false;
    }
    
    // methode pour récupérer une liste contenant tous les clients du gestionnaire de banque :
    public List<Client> getAllClients() {
        return new ArrayList<>(this.clients);
    }
    //------------------Accounts---------------------------------
    public void AccountManager() {
        accounts = new ArrayList<>();
    }

    
    // Méthode pour ajouter un compte
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    // Méthode pour supprimer un compte
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    
    // Méthode pour rechercher un compte par numéro de compte
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    // Méthode pour récupérer tous les comptes
    public List<Account> getAccounts() {
        return accounts;
    }
    
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

    
    //-----------------------------------------------------------
        
    
	// constructeur par défaut
	public BankManager() {
		this.managerID = "Undefined";
		this.clients = new ArrayList<Client>();
		this.accounts = new ArrayList<Account>();
	}
	
	// copie du constructeur
	public BankManager(BankManager newBankManager) {
		this.managerID = newBankManager.managerID;
		this.clients = newBankManager.clients;
		this.accounts = newBankManager.accounts;
	}
	
	
	// constructeur avec paramètres
	public BankManager(String managerID, List<Client> clients, List<Account> accounts) {
		super();
		this.managerID = managerID;
		this.clients = clients;
		this.accounts = accounts;
	}

	
	@Override
	public String toString() {
		return "BankManager [managerID=" + managerID + ", clients=" + clients + ", accounts=" + accounts + "]";
	}
	
/*
	@Override
	public String toString() {
	    StringBuilder stringbuilder = new StringBuilder();
	    stringbuilder.append("BankManager [managerID=").append(managerID).append(", clients=[");
	    
	    List<Client> allClients = getAllClients();
	    
	    for (Client client : allClients) {
	    	stringbuilder.append(client.getName()).append(", ").append(client.getClientId()).append(", ").append(client.getAccounts());
	    }
	    stringbuilder.append("]]");
	    return stringbuilder.toString();
	}*/

	

	
}
