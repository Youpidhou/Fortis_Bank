package bus;

import java.util.ArrayList;
import java.util.List;


// cette class est remplacer par la class BankManager
// qui fait la gestion des Accounts et des Clients
// a valider

public class ListAccounts {
	
	private List<Account> accounts;		
	
	// constructeur
	public ListAccounts(){
		accounts = new ArrayList<>(); 
	}
	
	
	// methode pour ajouter un compte
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	// getter pour acceder a la liste des comptes de l'exterieur
	public List<Account> getAccounts(){
		return accounts;
	}
	
	/*
	 * créer des instances de cette classe, 
	 * ajouter des comptes à la liste et 
	 * accéder à la liste des comptes à partir d'autres parties du programme.*/	
	
	
	
}
