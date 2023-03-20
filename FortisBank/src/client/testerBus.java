package client;

import bus.Account;
import bus.Bank;
import bus.Client;
import bus.Date;
import bus.BankManager;
import bus.EnumAccountType;
import bus.EnumStatus;
import bus.Transaction;

public class testerBus {

	public static void main(String[] args) {

	// creation de la banque
	Bank bank = new Bank();	
	bank.setBankName("Fortis Bank");
	bank.setNumberBank("001");
	bank.setAddress("95 Wallstreet");
	bank.setBalance(1000000000.00);
	// print bank
	System.out.println(bank);	
		
	// creation du manager
	BankManager bankManager = new BankManager();
	bankManager.setManagerID("MAN001");
	bankManager.setClients(null);
	System.out.println(bankManager);	
	
	// creation d un client
	Client client001 = new Client();
	client001.setClientId("cl001");
	client001.setName("George De LA Jungle");
	client001.setEmail("georgedelajungle@gorrilla.com");
	client001.setNip("123456");
	// print client
	System.out.println(client001);	
	
	// creation d un compte pour client 001
	Account accountClient001Check = new Account();
	accountClient001Check.setAccountNumber("Chk001");
	accountClient001Check.setDateOfOpening(new Date (20,20,2022));
	accountClient001Check.setAccountType(EnumAccountType.Checking);
	accountClient001Check.setStatus(EnumStatus.Active);
	accountClient001Check.setBalance(5000.00);	
	client001.addAccount(accountClient001Check);
	// print compte
	System.out.println(accountClient001Check);
	


	
	
	}
}
