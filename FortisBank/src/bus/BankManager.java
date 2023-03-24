package bus;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Miguel Beauchemin
 * @author Dominic Potvin
 */
public class BankManager {

    // Attributes
    private String managerID;
    private List<Client> clients;
    private List<Account> accounts;

    // Getter and Setter for managerID
    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    // Getter and Setter for clients
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    // Getter and Setter for accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    //---------------------- Clients ----------------------

    /**
     * Adds a new client to the list of clients.
     *
     * @param client The client to add.
     */
    public void addClient(Client client) {
        this.clients.add(client);
    }

    /**
     * Removes a client from the list of clients.
     *
     * @param client The client to remove.
     * @return true if the client was removed, false otherwise.
     */
    public boolean removeClient(Client client) {
        return this.clients.remove(client);
    }

    /**
     * Finds a client by their client ID.
     *
     * @param clientId The ID of the client to find.
     * @return The client if found, null otherwise.
     */
    public Client findClient(String clientId) {
        for (Client client : this.clients) {
            if (client.getClientId().equals(clientId)) {
                return client;
            }
        }
        return null;
    }

    /**
     * Returns a list of all clients.
     *
     * @return The list of all clients.
     */
    public List<Client> getAllClients() {
        return new ArrayList<>(this.clients);
    }

    //---------------------- Accounts ----------------------

    /**
     * Adds an account to a client's account list.
     *
     * @param clientId The ID of the client to add the account to.
     * @param account  The account to add.
     */
    public void addAccount(String clientId, Account account) {
        Client client = findClient(clientId);
        if (client != null) {
            client.getAccounts().add(account);
        }
    }

    /**
     * Removes an account from a client's account list.
     *
     * @param clientId      The ID of the client to remove the account from.
     * @param accountNumber The account number of the account to remove.
     * @return true if the account was removed, false otherwise.
     */
    public boolean removeAccount(String clientId, String accountNumber) {
        Client client = findClient(clientId);
        if (client != null) {
            for (Account account : client.getAccounts()) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return client.getAccounts().remove(account);
                }
            }
        }
        return false;
    }
    
    /**
     * Returns a list of all accounts managed by the manager.
     * @return The list of all accounts.
     */
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    /**
     * Finds an account by its account number.
     * @param accountNumber The account number to search for.
     * @return The account with the specified account number, or null if no such account exists.
     */
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
     
  //---------------------- Constructors ----------------------

    /**
     * Creates a new BankManager object with default values.
     */
    public BankManager() {
        this.managerID = "Undefined";
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    /**
     * Creates a new BankManager object with the same values as another BankManager object.
     * @param newBankManager The BankManager object to copy.
     */
    public BankManager(BankManager newBankManager) {
        this.managerID = newBankManager.managerID;
        this.clients = newBankManager.clients;
        this.accounts = newBankManager.accounts;
    }

    /**
     * Creates a new BankManager object with the specified values.
     * @param managerID The unique ID for the manager.
     * @param clients The list of clients managed by the manager.
     * @param accounts The list of accounts managed by the manager.
     */
    public BankManager(String managerID, List<Client> clients, List<Account> accounts) {
        this.managerID = managerID;
        this.clients = clients;
        this.accounts = accounts;
    }

	/**
	 * Returns a string representation of this BankManager object.
	 */
	@Override
	public String toString() {
		return "BankManager [managerID=" + managerID + ", clients=" + clients + ", accounts=" + accounts + "]";
	}
	
}
