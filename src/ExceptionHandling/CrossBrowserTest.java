package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {
		
		String browser = "opera";
		
		if(browser.equals("Chrome"))
		{
			System.out.println("Launch Chrome");
		}
		
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch Firefox");
		}
		
		else if(browser.equals("Safari"))
		{
			System.out.println("Launch Safari");
		}
		
		else
		{
			System.out.println("Pass the right browser");
			throw new MyException("browsernotFoundException");
		}
		
		

	}

}
