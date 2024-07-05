package ConstructorCalling;

public class Employee {
	
	String name;
	int age;
	String city;
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}


	public Employee(String name) {
		//calling a constructor in another constructor
		//On calling another constructor, it should be first statement, not the secnd
		this("Nil" , 50);
		
		this.name = name;
		
	}
	
	
	
	
	

}
