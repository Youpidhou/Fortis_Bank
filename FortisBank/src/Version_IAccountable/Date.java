package Version_IAccountable;

import java.io.Serializable;

public class Date extends Object implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private data member
	private int month;
	private int day;
	private int year;
	
	// public functions member
	
	public void setMonth(int month) 
	{
		if(month < 1 || month > 12)
			this.month = 0;		
		else this.month = month;		
	}	
	public int getMonth() {
		return this.month;
	}
	//---------------------	
	public void setDay(int day) {
		this.day = day;		
	}	
	public int getDay() {
		return this.day;
	}
	//---------------------	
	public void setYear(int year) {
		this.year = year;		
	}
	public int getYear() {
		return this.year;
	}	
	//---------------------	 constructor//---------------------	
	
	public Date() 
	{
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}
	
	public Date(int month, int day, int year) 
	{

		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);	
		
	}

	@Override
	public String toString() 
	{
		String state;
		state = this.month + "/" + this.day + "/" + this.year;
		return state;
	}
	
	
}
