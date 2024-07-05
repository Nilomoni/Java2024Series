package Interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
	
	//This is not static
	//This is not final as this is class variable
	//int min_fee = 100;
	
	//Fortis hospital is extending medical class
	//Fortis hospital is implementing 3 interfaces also
	//sequence should be first extends and then implements
	//If any class is implemetning interface, then the class must need to implement the interface method
	//otherwise the class will throw an error
	//need to select the "Add unimplemented methods" option 
	
     //US
	@Override
	public void physioService() {
		System.out.println("FH...physioService");
		
		
	}

	@Override
	public void cardioService() {
		System.out.println("FH...cardioService");
		
	}

	@Override
	public void gastroService() {
		System.out.println("FH...gastroService");
		
	}
	
    //UK 
	@Override
	public void neuroService() {
		System.out.println("FH...neuroService");
		
	}

	@Override
	public void entService() {
		System.out.println("FH...entService");
		
		
	}
	
    //India
	@Override
	public void onchoService() {
		System.out.println("FH...onchoService");
		
	}

	@Override
	public void orthoService() {
		System.out.println("FH...orthoService");
		
		
	}
    
	//In interface if there is common method for all, then child method will override the method only one time
	@Override
	public void emergencyService() {
		System.out.println("FH...emergencyService");
		
		
	}
	
	//individual method for FH
	
	public void ambulanceService()
	{
		System.out.println("FH....ambulanceService");
	}
	
	public void mediclaimService()
	{
		System.out.println("FH....mediclaimService");
	}
	
	
    //WHO
	@Override
	public void vaccination() {
		
		System.out.println("FH....Vaccination");
		
	}
	
	//method hiding
	public static void billing()
	{
		System.out.println("Fortis MEdical Billing");
	}
	
	//default/non-static method can be overridden after jdk 1.8
	//need to remove the default keyword from child interface class and make it public
	@Override
	public void medicalTest() 
	{
		System.out.println("This is Fortis Medical default method");
	}
	
	//Medical
//	@Override
//	public void rdmedical()
//	{
//		System.out.println("This is FH medical r&d");
//	}
	
	//assign - 2 college class have a parent class
	//3 interfaces
	//1 parent interfaces overall

}
