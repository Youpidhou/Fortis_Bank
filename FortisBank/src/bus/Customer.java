package bus;

public class Customer {
	private String customerNumber;
	private String name;
	private String email;
	
	
// -- Getter and Setter
// -------------------------------------
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
// -------------------------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
// -------------------------------------	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

// --------  Constructeurs -------------
	// default constructor		
	public Customer() {
		this.customerNumber = "Undefined";
		this.name = "Undefined";
		this.email = "Undefined";		
	}
	// copy constructor	
	public Customer(Customer newCustomer) {
		this.customerNumber = newCustomer.customerNumber;
		this.name = newCustomer.name;
		this.email = newCustomer.email;		
	}
	// constructor	with parameters
	public Customer(String customerNumber, String name, String email) {
		this.customerNumber = customerNumber;
		this.name = name;
		this.email = email;
		
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", name=" + name + ", email=" + email + "]";
	}	
	
	

}
