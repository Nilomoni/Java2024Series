package ExceptionHandling;

public class MultipleTryCatchBlock {
	int age;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//We can have multiple catch block with one try block
		//in that case if there is no exception on first block then it'll check the second one
		//if there is exception in first, then it'll not go to the second one/next one
		//both 'e' is different
		//duplicate catch blocks are not aloowed
		//n number of catch block can a program have
		
		MultipleTryCatchBlock obj = new MultipleTryCatchBlock();
		obj = null;
		
		try 
		
		{	
		int i = 9/3;
		obj = null;
		obj.age = 20;
		System.out.println("Hello" + " " +i);
		}
		
		catch(ArithmeticException e)//e is reference of the catch
		{
			System.out.println("AE is coming in try block");
			e.printStackTrace();	

	    }
		
		catch(NullPointerException e)
		{
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
	}
}


