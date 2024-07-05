package ExceptionHandling;

public class TryCatchBlock {

	int age;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//We can have multiple try catch block
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		try {
		obj.age = 20;
		}
		catch (NullPointerException e)
		{
			System.out.println("NPE is coming here");
			e.printStackTrace();
		}
		
		System.out.println("+=+++++++++++");
		
		try {
		int i = 9/0;
		System.out.println("Hello" + " " +i);
		}
		catch(ArithmeticException e)//e is reference of the catch
		{
			System.out.println("AE is coming in try block");
			e.printStackTrace();
			//printStackTrace method is use to catch the exception type
		}
		//Catch block will executed only when exception is there
		
		System.out.println("Bye");

	}

}
