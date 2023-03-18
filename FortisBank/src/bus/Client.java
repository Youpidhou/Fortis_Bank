package bus;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String clientId;
	private String name;
	private String email;
	private String nip;
	private List<Account> accounts;
	
		
	
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
		this.accounts = new ArrayList<Account>(newClient.accounts);

	}	
	
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.accounts = new ArrayList<Account>();
    }
	
	
	// constructor	with all parameters
    // constructor	with parameters
    public Client(String clientId, String name, String email, String nip, ArrayList<Account> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.nip = nip;
        this.accounts = accounts;
    }
    
    
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", accounts="
				+ accounts + "]";
	}	

}
