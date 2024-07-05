package Constructors;

public class Registration {

	String firstName;
	String lastName;
	String emailId;
	String phone;
	String pwd;
	String city;

	// Requirement: User can be created if you have :
	// 1. fn,ln
	// 2. fn,ln, email id
	// 3. fn
	// 4. fn,ln,pwd,phone
	// 5. fn,ln,email,phoen,pwd,city

	public Registration(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Registration(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public Registration(String firstName) {
		this.firstName = firstName;
	}

	public Registration(String firstName, String lastName, String pwd, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pwd = pwd;
		this.phone = phone;
	}

	public Registration(String firstName, String lastName, String emailId, String phone, String pwd, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.pwd = pwd;
		this.city = city;
	}

	public static void main(String[] args) {

		Registration usr1 = new Registration("Nilomoni", "Bhattacherjee");
		System.out.println("Created user1 is for: " + usr1.firstName + " " + usr1.lastName);

		Registration usr2 = new Registration("Nil", "Bhattacherjee", "test@test.com");
		System.out.println("Created user2 is for: " + usr2.firstName + " " + usr2.lastName + " " + usr2.emailId);

		Registration usr3 = new Registration("Tom");
		System.out.println("Created user3 is for: " + usr3.firstName);

		Registration usr4 = new Registration("Jason", "Statham", "Test@123", "9876543210");
		System.out.println("Created user4 is for: " + usr4.firstName + " " + usr4.lastName + " " + usr4.pwd + " " + usr4.phone);
		usr4.phone = "9634512890";
		System.out.println("Updated user4 is for: " + usr4.firstName + " " + usr4.lastName + " " + usr4.pwd + " " + usr4.phone);
	

		Registration usr5 = new Registration("Rocky", "Baloboa", "test@test.com", "Test@123", "9876543210", "Asansol");
		System.out.println("Created user5 is for: " + usr5.firstName + " " + usr5.lastName + " " + usr5.emailId + " "
				+ usr5.pwd + " " + usr5.phone + " " + usr5.city);

	}

}
