package Interface;

public interface USMedical extends WHO {
	
	//interface variable are static and final by default in nature
	int min_fee = 10;
	
	
	//interface to interface we can use extends
	//class to class extends
	//class to interface implements
	
	
	//Interface method donot have any body, it only have method declaration
	//This is called abstract method
	//Cannot create object of interface
	//Overrideen is possible in interface
	//cannot create constructor of interface
	//cannot have any parent class
	//can have the parent interface
	
	//abstract method has no body
	//interface follow 100% abstraction
	public void physioService(); //interface method
	
	public void cardioService();
	
	public void gastroService();
	
	public void emergencyService();
	
	//after jdk 1.8
	//1. we can have static method in interface with method body
	// We can't have non-static method in interface with method body
	// Static method cannot be abstracted
	
	public static void billing()
	{
		System.out.println("US MEdical Billing");
	}
	
	//2. default/non-static method with method body
	default void medicalTest() 
	{
		System.out.println("This is US Medical default method");
	}
		
	default void reportSection() 
	{
		System.out.println("This is US Medical report section");
	}
	
	
	
	

}
