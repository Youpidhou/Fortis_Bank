package bus;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
	
	private String managerID;
	private List<Client> clients; // créer un nouveau client
	
	
	// getter et setter
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	
	
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
    
    
	// constructeur par défaut
	public BankManager() {
		this.managerID = "Undefined";
		this.clients = new ArrayList<Client>();
	}
	
	// constructeur avec paramètres
	public BankManager(String managerID, List<Client> client) {
		this.managerID = managerID;
		this.clients = client;
	}
	
	
	
	@Override
	public String toString() {
		return "BankManager [managerID=" + managerID + ", clients=" + clients + "]";
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
