package ConstructorCalling;

public class BMW extends Car{
	
	public BMW() {
		super("X1" , 20);
		System.out.println("BMW Const...");
	}
	
	//1. if we want to call the parent clss constructor in child class, then by Super keyword we can do it
	//either it default const.. or parameterized const...
	
	//2. We cannot call 2 constructor at a time using super keyword or by anything
	
	//3. Super and this cannot be call together
	
	//4. private variable cannot be access by suoer keyword in child class
	
	//5. We can call parent class method also by Super keyword not the private method
	
	//6. We cannot call parent class interface using super as interface variable are by default static and final in nature
	
	
	public BMW(int price) {
		//this();
		super("Audi" , 50);
		//this();
		System.out.println("BMW Const...");
	}

}
