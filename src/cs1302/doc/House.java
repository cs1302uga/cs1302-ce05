package cs1302.doc;

import java.util.Random;
import java.text.DecimalFormat;

/*
 * The House Class represents a house. Each house has a price, and a for sale indicator.
 * Designed to be used on a real estate platform for buying a selling houses.
 */
public class House {
	
	/* instance variables */
	private boolean forSale;
	private double price;
		
	/*
	 * Creates a house with a random price (between $1000.00 and $100,000.00).
	 * 
	 * Houses are always for sale when they are first instantiated
	 */
	public House() {
	    forSale = true;
	    Random r = new Random();
	    price = (r.nextInt(9900000) + 100000) / 100.0;
	} // House
    
	/*
	 * House constructor with specified parameters.
	 * 
	 * Houses are always for sale when they are first instantiated.
	 * 
	 */
	public House(double price) {
	    if(price > 0) {
		this.price = price;
	    } // if
	} // House
	
	/*
	 * Returns a String representation of this House object
	 * Example: House(Price: $ 120,000.00)
	 */
	@Override
	public String toString() {
	    DecimalFormat decimalFormatObj = (DecimalFormat) DecimalFormat.getInstance();
	    decimalFormatObj.setDecimalSeparatorAlwaysShown(true);
	    String s = "";
	    decimalFormatObj.setMinimumFractionDigits(2);
	    decimalFormatObj.setMaximumFractionDigits(2);
	    s+= "House(Price: $" + decimalFormatObj.format(getPrice()) + ")";
	    return s;
	} // toString
	
	/*
	 * Changes the price of the house
      	 */
	public void setPrice(double price) {
	    if(price > 0) {
		this.price = price;
	    } // if
	} // setPrice
	
	/*
	 * Changes whether or not the house is for sale
	 */
	public void setForSale(boolean forSale) {
	    this.forSale = forSale;
	} // setForSale
	
	/*
	 * Returns true if this House is for sale and false otherwise. 
	 */
	public boolean isForSale() {
		return forSale;
	} // isForSale

	/*
	 * Returns the price of this house
	 */
	public double getPrice() {
	    return price;
	} // getPrice
} // House
