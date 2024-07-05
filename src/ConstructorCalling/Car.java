package ConstructorCalling;

public class Car {
	
	//super keyword
	String name;
	int price;
	
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public Car() {
		System.out.println("Car Const...");
	}
	
	

}
