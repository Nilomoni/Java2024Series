package Encapsulaton;

public class Browser {
	
	//Another encapsulation --
	//by accessing the private method in public method without getter and setter
	
	public void launchBrowser()
	{
		System.out.println("Launching the browser");
		
		//calling the privaye method in public method
		CheckBrowserVersion();
		checkOSCompatibility();
		checkRam();
		checkCPUUtilization();
		
		System.out.println("Browser is launched finally");
	}
	
	private void CheckBrowserVersion()
	{
		System.out.println("Check Browser Version");
	}
	
	private void checkOSCompatibility()
	{
		System.out.println("Check the OS");
	}
	
	private void checkRam()
	{
		System.out.println("Check the Ram Capacity");
	}
	
	private void checkCPUUtilization()
	{
		System.out.println("Check the CPU.....");
	}
	
	
	

}
