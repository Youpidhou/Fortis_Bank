package client;

import java.util.List;

import bus.Account;
import bus.Bank;
import bus.Client;
import bus.Date;
import bus.BankManager;
import bus.EnumAccountType;
import bus.EnumStatus;
import bus.EnumTransactionType;
import bus.Transaction;
import bus.Zipcode;


/**
 * @author Dominic Potvin
 * 
 * */
public class testerBus {

	public static void main(String[] args) {

		
	// creation de la banque
	Bank bank = new Bank();	
	bank.setBankName("Fortis Bank");
	bank.setNumberBank("001");
	bank.setAddress("95 Wallstreet");
	Zipcode zipcodeBank = new Zipcode();
	zipcodeBank.setCity("New York");
	zipcodeBank.setState("New York");
	zipcodeBank.setZipcode("10005");
	bank.setZipcode(zipcodeBank);
	bank.setStatus(EnumStatus.Active);
	bank.setBalance(1000000000.00);
	
	// print bank
	//System.out.println(bank);	
		
	// creation du manager
	BankManager bankManager = new BankManager();
	bankManager.setManagerID("MAN001");	
	
	
	// creation d un client
	// le manageger cree un client
	Client client001 = new Client();
	client001.setClientId("cl001");
	client001.setName("George De LA Jungle");
	client001.setEmail("georgedelajungle@gorrilla.com");
	Zipcode zipcodeClient001 = new Zipcode();
	zipcodeClient001.setCity("New York");
	zipcodeClient001.setZipcode("10004");
	zipcodeClient001.setState("New York");	
	client001.setZipcode(zipcodeClient001);
	client001.setNip("123456");
	// print client
	//System.out.println(client001);	
	
	// creation d un client2
	// le manageger cree un client
	Client client002 = new Client();
	client002.setClientId("cl002");
	client002.setName("Goldorak ");
	client002.setEmail("goldo@rak.com");
	Zipcode zipcodeClient002 = new Zipcode();
	zipcodeClient002.setCity("New York");
	zipcodeClient002.setZipcode("10002");
	zipcodeClient002.setState("New York");	
	client002.setZipcode(zipcodeClient002);
	client002.setNip("654321");
	// print client
	//System.out.println(client002);
	
	
	// ajout de clients au manager
	bankManager.addClient(client001);
	bankManager.addClient(client002);

	
	// creation d un compte pour client 001
	Account accountClient001Check = new Account();
	accountClient001Check.setAccountNumber("Chk001");
	accountClient001Check.setDateOfOpening(new Date (20,20,2022));
	accountClient001Check.setAccountType(EnumAccountType.Checking);
	accountClient001Check.setStatus(EnumStatus.Active);
	accountClient001Check.setBalance(5000.00);	
	client001.addAccount(accountClient001Check);
	// print compte
	//System.out.println(accountClient001Check);
	
	// creation d un compte pour client 001
	Account accountClient001Sav = new Account();
	accountClient001Sav.setAccountNumber("Sav001");
	accountClient001Sav.setDateOfOpening(new Date (20,20,2022));
	accountClient001Sav.setAccountType(EnumAccountType.Saving);
	accountClient001Sav.setStatus(EnumStatus.Active);
	accountClient001Sav.setBalance(55000.00);	
	client001.addAccount(accountClient001Sav);
	// print compte
	//System.out.println(accountClient001Sav);
	
	// way # 1 // print de tous les compte du client
	List<Account> accountcl001 = client001.getAccounts();
	
	for(Account account : accountcl001) {
		System.out.println("Compte du client no: " +client001.getClientId() + " " + account);
	}

	// way # 2 // print de tous les compte du client
	System.out.println("Liste des compte du client 002 : " + client002.getAccounts());
	
	
	// print tout les client du manager	
	// facon #1
	//System.out.println(bankManager.getAllClients());
	// facon #2
	List<Client> clients = bankManager.getAllClients();		
	for (Client client : clients) {
	    System.out.println("Client du manager no: " + bankManager.getManagerID() + " " + client);
	}

	// suppression d un compte
	boolean removed = bankManager.removeAccount("cl001", "Chk001"); 
	if (removed) {
	    System.out.println("Le compte Chk001 du client cl001 a ete supprime avec succes.");
	} else {
	    System.out.println("La suppression du compte Chk001 du client cl001 a echoue.");
	}	
	
	// transaction
	Transaction transaction = new Transaction();
	transaction.setTransaction(1);
	transaction.setDescription("Paiement par carte de debit");
	transaction.setDateTransaction(new Date(01,01,2023));
	transaction.setAmount(175.55);
	transaction.setTransType(EnumTransactionType.Withdraw);	
	Account account = client001.getAccounts().get(0);
	boolean success = account.Withdraw(transaction.getAmount());	
	if (success) {
	    account.addTransaction(transaction);
	    System.out.println("Retrait de " + transaction.getAmount() + " effectué avec succès sur le compte " + account.getAccountNumber() + ".");
	} else {
	    System.out.println("Impossible de retirer " + transaction.getAmount() + " du compte " + account.getAccountNumber() + " car le solde est insuffisant.");
	}
	account.addTransaction(transaction);
	
	System.out.println("Liste des compte du client 001 : " + client001.getAccounts());
	System.out.println(client001);
	
	//System.out.println(bankManager);
		
	}
}
