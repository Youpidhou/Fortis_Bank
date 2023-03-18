package temp;

import java.util.ArrayList;
import java.util.List;

public class BankManager {
	
	private String managerID;
	private List<Client> clients; // creer un nouveau client
	
	
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
	
	// methode ajouter un clients a la banque
	
    public void addClient(Client client) {
        this.clients.add(client);
    }
    // methode supprimer les clients de la banque
    public boolean removeClient(Client client) {
        return this.clients.remove(client);
    }    
    
    // methode pour rechercher un client
    public Client findClient(String clientId) {
        for (Client client : this.clients) {
            if (client.getClientId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }
    
    
    
	// constructeur par default
	public BankManager() {
		this.managerID = "Undefined";
		this.clients = new ArrayList<Client>();

	}
	
	
	// constructeur avec parametres
	public BankManager(String managerID, List<Client> client) {
		this.managerID = managerID;
		this.clients = client;
	}
	
	
	@Override
	public String toString() {
		return "BankManager [managerID=" + managerID + ", clients=" + clients + "]";
	}
	
	
}
