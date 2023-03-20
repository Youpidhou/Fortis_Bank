package bus;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
	
	private String managerID;
	private List<Client> clients; // créer un nouveau client
	
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
    public void addClient(Client client) {
        this.clients.add(client);
    }
    
    public boolean removeClient(Client client) {
        return this.clients.remove(client);
    }    
    
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
	
}
