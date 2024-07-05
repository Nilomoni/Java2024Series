package Inheritance;

public class BMW extends Car{
	
	//Overridden method as same start method is available for car class
	//but this is modfied method
	//When you have a method in parent class and the same method in child class with the same
	//with the same number of parameters
	//with the same return type
	//with the same sequence of parameter
	//It is runtime/dynamic polymorphism also
	//Poly - many + morphism - forms
	//final class can not be inherited
	//final method cannot be overridden
	//final keywrod to use constant values
	//final class cannot be a parent class
	//parent class static method cannot be overridden in child class
	//But we can call the parent class static method
	//Private method cannot be overridden
	
	@Override
	public void start()
	{
		System.out.println("BMW start");
	}
	
	
	public void autoParking()
	{
		System.out.println("BMW AutoParking");
	}
	
	@Override
	public void petrolEngine()
	{
		System.out.println("BMW Petrol Engine");
	}
	
	
	//method hiding
	//When u have a static method in parent class and the same static method in child class also is called method hiding
    public static void billing()
	{
		System.out.println("BMW billing");
	}
	
//	@Override
//	private void pickColor()
//	{
//		System.out.println("BMW pick Colour");
//	}
	
	
	


}
