package AbstractClasses;

public class LoginPage extends page {
	
//	//LoginPage constructor
//	public LoginPage()
//	{
//		System.out.println("Login Page Const...");
//	}
//	//In child class always parameterized const. will be called first
//	public LoginPage(int i)
//	{
//		System.out.println("Login Page Const...:" + i);
//	}

	@Override
	public void title() 
	{
		System.out.println("Login Title");
		
	}

	@Override
	public void url() 
	{
		System.out.println("https://www.example.com");
		
	}
	
	@Override
     public void pageloadtime() 
	
	{
		System.out.println("Login Page timeout ----5 sec");
	}
	
	public void forgotPassword()
	{
		System.out.println("Change the password");
	}
	
	//method hiding
	public static void footer()
	{
		System.out.println("Login Page footer");
	}

}
