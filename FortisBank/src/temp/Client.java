package temp;

import java.util.ArrayList;
import java.util.List;


public class Client implements Account{
	
	private String clientId;
	private String name;
	private String email;
	private String nip;
	private Account account;	
	private List<Account> accounts;
	
		
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}	
	
	// getter and setter
	//-------------------------------------
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	//-------------------------------------
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	//-------------------------------------

	
    // Getter and setter for accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
	

// --------  Constructeurs -------------
    
	// default constructor		
	public Client() {
		this.clientId = "Undefined";
		this.name = "Undefined";
		this.email = "Undefined";
		this.nip = "Undefined";		
		this.accounts = new ArrayList<Account>();

	}
	// copy constructor	
	public Client(Client newClient) {
		this.clientId = newClient.clientId;
		this.name = newClient.name;
		this.email = newClient.email;
		this.nip = newClient.nip;
		this.account = newClient.account;
		this.accounts = new ArrayList<Account>(newClient.accounts);

	}	
	
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip, Account account) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.account = account;
        this.accounts = new ArrayList<Account>();
    }
	
	
	// constructor	with all parameters
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip, Account account, ArrayList<Account> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.accounts = accounts;
        this.accounts = new ArrayList<Account>();
    }
    
    
    
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", account="
				+ account + ", accounts=" + accounts + "]";
	}
	
	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Date getDateOfOpening() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDateOfOpening(Date dateOfOpening) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public EnumAccountType getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setAccountType(EnumAccountType accountType) {
		// TODO Auto-generated method stub
		
	}
}
