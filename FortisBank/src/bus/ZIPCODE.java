package bus;

import java.util.ArrayList;

public class ZIPCODE {
	private String zipcode;
	private String city;
	private String state;
	
	
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	
	// default constructor		
	public ZIPCODE() {
		super();
		this.zipcode = "Undefined";
		this.city = "Undefined";
		this.state = "Undefined";
	}
	
	// copy constructor	
	public ZIPCODE(ZIPCODE newZIPCODE) {
		super();
		this.zipcode = newZIPCODE.zipcode;
		this.city = newZIPCODE.city;
		this.state = newZIPCODE.state;

	}	
	
	
	public ZIPCODE(String zipcode, String city, String state) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	
	
	
	@Override
	public String toString() {
		return "ZIPCODE [zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
