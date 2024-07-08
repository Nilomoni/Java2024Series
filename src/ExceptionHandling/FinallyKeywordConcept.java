package ExceptionHandling;

public class FinallyKeywordConcept {

	public static void main(String[] args) {
		
		System.out.println("hi");
		
		try {
		int i = 9/0;
		}
		catch(Exception e)
	{
		System.out.println("AE is coming");
		e.printStackTrace();
		//System.exit(1);
		//this line will never allowed the JVM to execute the finally block
		//1 is the status to the JVM to shut down
		//But never use this line of code
		//As it'll never execute the other code also in the same class
		}
		
		//finally should always come with try catch block
		//It must have a body/block
		//We can write try block without catch block using finally block
		//But we need to always use catch block to handle a exception
		//Only one finally block can be available
		//Multiple finalyy block will not be allowed
		//sequence should be try ---> catch ----> finally
		//Finally block will always executed if exception is there or not
		//Finally block return value always override the try catch block return value
		
		finally 
		{
			System.out.println("Bye---Finally Block");
		}
		
		
		
		
		
		
		

	}

}
