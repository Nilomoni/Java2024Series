package Inheritance;

public  class Car extends Vehicle {
	
	//We don't want to overide or inherit this particular feature
	public final void service()
	{
		System.out.println("Car Service");
	}
	
	public void start()
	{
		System.out.println("Car Start");
	}
	
	public void stop()
	{
		System.out.println("Car Stop");
	}
	
	public void reFuel()
	{
		System.out.println("Car Refuel");
	}
	
	public static void billing()
	{
		System.out.println("Car billing");
	}
	
	@Override
	public void petrolEngine()
	{
		System.out.println("Car Petrol Engine");
	}
	
	
	private void pickColor()
	{
		System.out.println("Car Colour");
	}
	
	

}
