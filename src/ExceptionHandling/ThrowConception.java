package ExceptionHandling;

public class ThrowConception {

	public static void main(String[] args) {
		
		try {
		throw new Exception("User is not found");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		String data = null;
		if(data == null)
		{
			try {
				throw new Exception("DATA-NOT-FOUND-EXCEPTION");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		}
		try {
		System.out.println(data.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Cannot calculate length");
		}
		System.out.println("Bye");

	}

}
