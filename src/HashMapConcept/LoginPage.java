package HashMapConcept;

import java.util.HashMap;

public class LoginPage {
	
	
	public static String getUserCred(String role)
	//This method takes a role as an argument and returns the credentials (email and password) for that role as a String
	{
		HashMap<String, String> credMap= new HashMap<String, String>();
		credMap.put("superadmin", "superadmin@gmail.com; superadmin@123");
		credMap.put("admin", "admin@gmail.com; admin@123");
		credMap.put("customer", "customer@gmail.com; Test@123");
		credMap.put("seller", "seller@gmail.com; seller@123");
		credMap.put("partner", "partner@gmail.com; partner@123");
		
		//This line retrieves and returns the credentials for the given role from the credMap
		return credMap.get(role);
		
	}
	
	public static void doLogin(String un, String pwd)
	//This method takes a username (un) and password (pwd) as arguments and prints a login message.
	{
		System.out.println("Login with : " + un + " : " +pwd);
	}

	public static void main(String[] args) {
		
		String Cred[] = getUserCred("superadmin").split(";");//Calling getUserCred method and give the role
		String un = Cred[0].trim();
		String pwd = Cred[1].trim();
		doLogin(un, pwd);

	}

}
