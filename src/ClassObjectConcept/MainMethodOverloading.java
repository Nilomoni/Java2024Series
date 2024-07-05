package ClassObjectConcept;

public class MainMethodOverloading {

	// We can overload main method
	// But JVm is always looking for the main method with string array parameter
	// with public static void main
	// There is no use cases for main method overloading
	// if we remove that actual main method then the program will no longer be able
	// to run
	// And will show an error

	public static void main(String []args) {

		System.out.println("This is Main 1");

	}

	public static void main(int a) {

		System.out.println("This is Main 2");

	}

	public static void main(int a, int b) {

		System.out.println("This is Main 3");

	}

}
