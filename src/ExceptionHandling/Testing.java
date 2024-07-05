package ExceptionHandling;

public class Testing {
	
	public static int div(int a, int b)
	{
		int c = 0;
		try {
		c = a/b; //AE if b = 0
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("b is zero");
			e.printStackTrace();
			
		}
		return c;
	}

	public static void main(String[] args) {
		
		int d = div(10 , 2);
		System.out.println(d);
		
		

	}

}
