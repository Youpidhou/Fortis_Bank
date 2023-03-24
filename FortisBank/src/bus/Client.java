package bus;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Miguel Beauchemin
 * @author Dominic Potvin
 */
public class Client {
	
	// Attributes
	private String clientId;
	private String name;
	private String email;
	private String nip;	
	private List<Account> accounts;
	private Zipcode zipcode;		

	
	// Getter and Setter for clientId
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	// Getter and Setter for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter and Setter for email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter and Setter for nip
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	// Getter and Setter for zipcode
	public Zipcode getZipcode() {
		return zipcode;
	}
	public void setZipcode(Zipcode zipcode) {
		this.zipcode = zipcode;
	}
	
	// Getter and Setter for accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
	
    /**
	 * Adds an account to the list of accounts for this client.
	 * @param account The account to add.
	 */
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
	

    // Constructors
    /**
     * Default constructor.
     * Sets all properties to "Undefined" and creates an empty account list.
     */
    public Client() {
        this.clientId = "Undefined";
        this.name = "Undefined";
        this.email = "Undefined";
        this.zipcode = new Zipcode();
        this.nip = "Undefined";
        this.accounts = new ArrayList<>();
    }

    /**
     * Copy constructor.
     * Creates a new Client object with the same property values as the given Client object.
     * @param newClient The Client object to copy.
     */
    public Client(Client newClient) {
        this.clientId = newClient.clientId;
        this.name = newClient.name;
        this.email = newClient.email;
        this.zipcode = newClient.zipcode;
        this.nip = newClient.nip;
        this.accounts = new ArrayList<>(newClient.accounts);
    }

    /**
     * Constructor with parameters.
     * Creates a new Client object with the given property values and an empty account list.
     * @param clientId The client ID.
     * @param name The client name.
     * @param email The client email.
     * @param zipcode The client ZIP code.
     * @param nip The client NIP.
     */
    public Client(String clientId, String name, String email, Zipcode zipcode, String nip) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.zipcode = zipcode;
        this.nip = nip;
        this.accounts = new ArrayList<>();
    }

    /**
     * Constructor with parameters.
     * Creates a new Client object with the given property values and account list.
     * @param clientId The client ID.
     * @param name The client name.
     * @param email The client email.
     * @param zipcode The client ZIP code.
     * @param nip The client NIP.
     * @param accounts The list of accounts for this client.
     */
    public Client(String clientId, String name, String email, Zipcode zipcode, String nip, ArrayList<Account> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.zipcode = zipcode;
        this.nip = nip;
        this.accounts = accounts;
    }
    
	/**
	 * Returns a string representation of this Client object.
	 */
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", email=" + email + ", nip=" + nip + ", accounts="
				+ accounts + ", zipcode=" + zipcode + "]";
	}
       

}
