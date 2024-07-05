package Polymorphism;

public class Browsers {
	
	String name;
    static String hq = "Pune";
	
	
	public int getBrowserVersion()
	{
		System.out.println("Get Browser Version");
		return 100;
	}
	
	public static String getBrowserVendor()
	{
		System.out.println("Get Browser Version");
		return "Mozilla";
	}
	
	
	public static void main(String[] args) {
		
		Browsers obj = new Browsers();
		obj.getBrowserVersion();
		getBrowserVendor();
		//static variable can call by class name or can directly
		//We can call static with browser object but it'll display a warning
		//static method will be stored in CMA
		
		
		

	}

}
