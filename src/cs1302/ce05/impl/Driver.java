package cs1302.ce05.impl;

public class Driver {
    public static void main(String[] args) {
	Car fastCar = new Car(185.5);
	Car slowCar = new Car(75.0);

	System.out.println(slowCar);
	System.out.println(fastCar);

	if(slowCar.speedUp(20.0)) {
	    System.out.println("slowCar sped up");
	} // if
	if(fastCar.speedUp(75.5)) {
	    System.out.println("fastCar sped up");
	} // if
	
	slowCar.speedUp(80.5);
	fastCar.speedUp(200);

	if(slowCar.slowDown(10)) {
	    System.out.println("slowCar slowed down");
	} // if
	if(fastCar.slowDown(25.0)) {
	    System.out.println("fastCar slowed down");
	} // if

	System.out.println(slowCar);
	System.out.println(fastCar);   
    } // main
} // Driver