package temp;

import java.util.ArrayList;
import java.util.List;

public class ListAccounts {
	
	private List<IAccount> accounts;
		
	
	// constructeur
	public ListAccounts(){
		accounts = new ArrayList<>(); 
	}
	
	
	// methode pour ajouter un compte
	public void addAccount(IAccount account) {
		accounts.add(account);
	}
	
	// getter pour acceder a la liste des comptes de l'exterieur
	public List<IAccount> getAccounts(){
		return accounts;
	}
	
	/*
	 * créer des instances de cette classe, 
	 * ajouter des comptes à la liste et 
	 * accéder à la liste des comptes à partir d'autres parties du programme.*/	
	
	
	
}
