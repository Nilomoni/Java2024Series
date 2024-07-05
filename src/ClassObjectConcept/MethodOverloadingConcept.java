package ClassObjectConcept;

public class MethodOverloadingConcept {

    //Duplicate method with different parameter is allowed in java in same class
	//This is called method overloadng
	//1. With the same name
	//2. With the different parameter
	//3. With the different number of parameter
	//4. with the sequence of the parameter
	//5. return type doesn't matter
	
	public void test() {
		System.out.println("Test Method");
	}

	public void test(int i) {
		System.out.println(10);
	}

	public void test(String name) {
		System.out.println("Nilomoni");
	}
	
	public void test(String s , int i) {
		System.out.println("Nilomoni"+10);
	}
	
	public void test(int s , String i) {
		System.out.println("Nilomoni"+10);
	}

	public static void main(String[] args) {

	}

}
