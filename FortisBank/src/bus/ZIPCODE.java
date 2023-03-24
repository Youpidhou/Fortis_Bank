package bus;

	/**
	 * 
	 * @author Miguel Beauchemin
	 * @author Dominic Potvin
	 */
public class Zipcode {

	// Attributes
	private String zipcode; 
	private String city; 
	private String state; 
	
	// Getter and setter methods for zipcode
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	// Getter and setter methods for city
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	// Getter and setter methods for state
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	
	//---------------------	 constructors  ---------------------	
	
    /**
     * Default constructor that sets all instance variables to "Undefined".
     */
    public Zipcode() {
        this.zipcode = "Undefined";
        this.city = "Undefined";
        this.state = "Undefined";
    }

    /**
     * Copy constructor that creates a new Zipcode object with the same values as another Zipcode object.
     * @param newZipcode The Zipcode object to copy.
     */
    public Zipcode(Zipcode newZipcode) {
        this.zipcode = newZipcode.zipcode;
        this.city = newZipcode.city;
        this.state = newZipcode.state;
    }

    /**
     * Constructor that creates a new Zipcode object with specified ZIP code, city, and state values.
     * @param zipcode The ZIP code value.
     * @param city The city value.
     * @param state The state value.
     */
    public Zipcode(String zipcode, String city, String state) {
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }
	
	/**
	 * Returns a string representation of this Zipcode object.
	 */
	@Override
	public String toString() {
		return "Zipcode [zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}
}

