package client;

import java.util.List;

import temp.Bank;
import temp.BankManager;
import temp.Client;
import temp.EnumStatus;
import temp.IAccount;

public class testerTemp {
	public static void main(String[] args) {

	Bank bank = new Bank();	
	bank.setBankName("Fortis Bank");
	bank.setNumberBank("001");
	bank.setAddress("95 Wallstreet");
	bank.setBalance(1000000000.00);
	bank.setStatus(EnumStatus.Active);

	
	System.out.println(bank);	
	
	
	BankManager bankManager = new BankManager();
	bankManager.setManagerID("MAN001");
	bankManager.setClients(null);
	
	Client client001 = new Client();
	client001.setClientId("cl001");
	client001.setName("George De LA Jungle");
	client001.setEmail("georgedelajungle@gorrilla.com");
	client001.setNip("123456");
	//client001.setAccountNumber("cp123");
	//client001.setAccountType(EnumAccountType.Checking);
	//client001.setAccount(client001);

	System.out.println(client001);	
	
	}
}