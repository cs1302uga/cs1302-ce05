package cs1302.doc;

import java.util.Random;
import java.text.DecimalFormat;

/*
 * This class represents a house object. Each House object has
 * an associated price, and an indicator for whether or not the
 * house is currently for sale.
 *
 * A House object cannot have a negative price. The 
 * constructor and setter methods in this class ensure this condition
 * via exceptions.
 *
 * By default, a House object is for sale.
 */
public class House {
	
    private boolean forSale;
    private double price;
		
    /*
      * Constructs a House with a random price between 
      * $1000.00 and $100,000.00. 
      * By default, a House object is for sale when it is
      * instantiated
      */
    public House() {
	forSale = true;
	Random r = new Random();
	price = (r.nextInt(9900000) + 100000) / 100.0;
    } // House
    
    /*
     * Constructs a House object with a given price.
     * The value for price cannot be a negative number.
     */
    public House(double price) {
	if(price > 0) {
	    this.price = price;
	} // if
    } // House
	
    /*
     * Returns a String representation of this House object
     * in the following format: House(Price: $ 120,000.00)
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
      * Modifies the price of this House with the given
      * price value. price is in USD.
      * The value for price cannot be negative.
      */
    public void setPrice(double price) {
	if(price > 0) {
	    this.price = price;
	} // if
    } // setPrice
	
    /*
     * Modifies whether or not the house is for sale.
     */
    public void setForSale(boolean forSale) {
	this.forSale = forSale;
    } // setForSale
	
    /*
     * Returns true if this House is for sale and false 
     * otherwise. 
     */
    public boolean isForSale() {
	return forSale;
    } // isForSale

    /*
     * Returns the price of this house.
     */
    public double getPrice() {
	return price;
    } // getPrice
} // House
