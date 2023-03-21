package bus.ToValidate;

import java.util.ArrayList;
import java.util.List;

import bus.Transaction;

public class ListTransactions {

	private List<Transaction> transactions;
	
	// constructeur
	public ListTransactions(){
		transactions = new ArrayList<>(); 
	}
	
	
	// methode pour ajouter une transaction
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	// getter pour acceder a la liste des transaction de l'exterieur
	public List<Transaction> getTransactions(){
		return transactions;
	}
	
	/*
	 * créer des instances de cette classe, 
	 * ajouter des transactions à la liste et 
	 * accéder à la liste des transaction à partir d'autres parties du programme.*/	
}
