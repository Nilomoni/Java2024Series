package Encapsulaton;

public class LoginPage {

	private String userName;
	private String password;

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pwd) {
		System.out.println("Enter the username: " + un);
		System.out.println("Enter the password: " + pwd);
		System.out.println("Click on login button");

		if (isUserActive(un)) {
			System.out.println("User is active and Login successfull");
		}
		else
		{
			System.out.println("Please check user status");
		}
	}

	private boolean isUserActive(String un) {
		System.out.println("Checking user current status for the user: " + un);
		return true;
	}

}
