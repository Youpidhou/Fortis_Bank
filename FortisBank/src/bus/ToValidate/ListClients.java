package bus.ToValidate;
import java.util.ArrayList;
import java.util.List;

import bus.Client;



//cette class est remplacer par la class BankManager
//qui fait la gestion des Accounts et des Clients
//a valider

public class ListClients {
	
	private List<Client> clients;	

	public List<Client> getClient() {
		return clients;
	}
	
	// constructeur
	public ListClients() {
		clients = new ArrayList<>();
	}
		
	
	// methode pour ajouter une transaction
	public void addClients(Client client) {
		clients.add(client);
	}
	
	// getter pour acceder a la liste des transaction de l'exterieur
	public List<Client> getClients(){
		return clients;
	}
	
	/*
	 * créer des instances de cette classe, 
	 * ajouter des client a à la liste et 
	 * accéder à la liste des clients à partir d'autres parties du programme.*/	
	
	
}
