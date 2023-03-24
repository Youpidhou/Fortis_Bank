package bus;

import java.io.Serializable;

public class Date extends Object implements Serializable{
	
	/**
	 * 
	 * @author Miguel Beauchemin
	 * @author Dominic Potvin
	 */
	private static final long serialVersionUID = 1L;
	
	// instance variables
	private int month;
	private int day;
	private int year;
	
    /**
     * Sets the month of the Date object to the given value.
     * If the value is not between 1 and 12, sets month to 0.
     * 
     * @param month an integer representing the month (1-12)
     */
	//getter and setter for month
	public void setMonth(int month) 
	{
		if(month < 1 || month > 12)
			this.month = 0;		
		else this.month = month;		
	}	
	public int getMonth() {
		return this.month;
	}
	
	//getter and setter for day
	public void setDay(int day) {
		this.day = day;		
	}	
	public int getDay() {
		return this.day;
	}
	
	//getter and setter for year
	public void setYear(int year) {
		this.year = year;		
	}
	public int getYear() {
		return this.year;
	}
	
	//---------------------	 constructor ---------------------	
	    
    /**
     * Default constructor for the Date class.
     * Sets all instance variables to zero.
     */
    public Date() {
        this.month = 0;
        this.day = 0;
        this.year = 0;
    }
    
    /**
     * Constructor for the Date class with parameters.
     * Initializes instance variables with the given values.
     * 
     * @param month an integer representing the month (1-12)
     * @param day an integer representing the day (1-31)
     * @param year an integer representing the year
     */
    public Date(int month, int day, int year) {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);   
    }

	/**
	 * Returns a string representation of this Date object.
	 */
	@Override
	public String toString() 
	{
		String state;
		state = this.month + "/" + this.day + "/" + this.year;
		return state;
	}
	
	
}
