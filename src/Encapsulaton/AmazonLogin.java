package Encapsulaton;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//login
		LoginPage lp = new LoginPage("test@test.com", "Test@123");
		
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		System.out.println("----------------------------");
		
		//reset the password
		lp.setPassword("Test@1234");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		
		System.out.println("----------------------------");
		
		//login with another user
		//We need to create another class object each and every time when a new user regsitered
		LoginPage lp1 = new LoginPage("tom@gmail.com", "Test@123");
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());

		

	}

}
