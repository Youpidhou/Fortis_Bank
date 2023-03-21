package bus;

import java.util.ArrayList;
import java.util.List;


public class Client {
	
	private String clientId;
	private String name;
	private String email;
	private String nip;
	//private Account account;	
	private List<Account> accounts;
	private ZIPCODE zipcode;		

	
	// getter and setter
	//-------------------------------------
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//-------------------------------------
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	//-------------------------------------
	public ZIPCODE getZipcode() {
		return zipcode;
	}
	public void setZipcode(ZIPCODE zipcode) {
		this.zipcode = zipcode;
	}
	
	//-------------------------------------
	/*public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}	
	*/
	
	
    // Getter and setter for accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
	

// --------  Constructeurs -------------
    
	// default constructor		
	public Client() {
		this.clientId = "Undefined";
		this.name = "Undefined";
		this.email = "Undefined";
		this.zipcode = new ZIPCODE();
		this.nip = "Undefined";
		//this.account = new Account();
		this.accounts = new ArrayList<Account>();

	}
	// copy constructor	
	public Client(Client newClient) {
		this.clientId = newClient.clientId;
		this.name = newClient.name;
		this.email = newClient.email;
		this.zipcode = newClient.zipcode;
		this.nip = newClient.nip;
		//this.account = newClient.account;
		this.accounts = new ArrayList<Account>(newClient.accounts);

	}	
	
    public Client(String clientId, String name, String email, ZIPCODE zipcode, String nip/*,Account account*/) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.zipcode = zipcode;
        this.nip = nip;
        //this.account = account;
        this.accounts = new ArrayList<Account>();
    }
	
    // constructor	with parameters
    public Client(String clientId, String name, String email,ZIPCODE zipcode, String nip/*, Account account*/, ArrayList<Account> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.zipcode = zipcode;
        this.nip = nip;
        //this.accounts = accounts;
        this.accounts = new ArrayList<Account>();
    }
    
    
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", accounts="
				+ accounts + ", zipcode=" + zipcode + "]";
	}
    
    /*
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", account="
				+ account + ", accounts=" + accounts + ", zipcode=" + zipcode + "]";
	}
    */

    

}
