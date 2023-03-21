package Version_IAccountable;

import java.util.ArrayList;
import java.util.List;


public class Client{
	
	private String clientId;
	private String name;
	private String email;
	private String nip;
	private IAccount account;	
	private List<IAccount> accounts;
	
	
	// getter and setter
	//-------------------------------------	
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	//-------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//-------------------------------------
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
	public IAccount getAccount() {
		return account;
	}
	public void setAccount(IAccount account) {
		this.account = account;
	}	
	//-------------------------------------
	
    // Getter and setter for accounts
    public List<IAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<IAccount> accounts) {
        this.accounts = accounts;
    }
	

// --------  Constructeurs -------------
    
	// default constructor		
	public Client() {
		this.clientId = "Undefined";
		this.name = "Undefined";
		this.email = "Undefined";
		this.nip = "Undefined";		
		this.accounts = new ArrayList<IAccount>();

	}
	// copy constructor	
	public Client(Client newClient) {
		this.clientId = newClient.clientId;
		this.name = newClient.name;
		this.email = newClient.email;
		this.nip = newClient.nip;
		this.account = newClient.account;
		this.accounts = new ArrayList<IAccount>(newClient.accounts);

	}	
	
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip, IAccount account) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.account = account;
        this.accounts = new ArrayList<IAccount>();
    }
	
	
	// constructor	with all parameters
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip, IAccount account, ArrayList<IAccount> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.accounts = accounts;
        this.accounts = new ArrayList<IAccount>();
    }
    
    
    
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", account="
				+ account + ", accounts=" + accounts + "]";
	}

}
