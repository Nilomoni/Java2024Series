package ExceptionHandling;

public class ThrowsKeyowrdConcept {
	
	//for not handling the exception we're using throws keyword
	public void m1()
	{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2 method");
		//as m2 is calling m3 and m3 send throws exception from it's method
		try {
		m3();
		}
		catch(ArithmeticException e)//e is reference of the catch
		{
			System.out.println("AE is coming in try block");
			e.printStackTrace();	

	    }
	}
	
	public void m3() throws ArithmeticException
	{
		System.out.println("m3 method");
		int i = 9/0;
	}
	
	
	public static void main(String[] args)  {
		
		ThrowsKeyowrdConcept obj = new ThrowsKeyowrdConcept ();
		
		obj.m1();
		
		System.out.println("Bye");

	}

}
