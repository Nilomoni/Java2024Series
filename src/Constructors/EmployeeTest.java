package Constructors;

public class EmployeeTest {
	
	
	String name;
	int age;
	double salary;
	
	//hidden const..will be added by default by java at the runtime to create the object
	//const.. can be use to initialize the global/class variable using this keyword
	//const vs method
	//with the method we can't restrict the object creation but with const..we can
	//We can't write business logic inside const..as const..don't have return type
	//method is reperesenting the feature
	//methods can be reusable
	
	
	
	public EmployeeTest(String name) //this name is local variable
	{
		//this.global/class variable = local variable
		this.name = name;
		//this we use as we want to give "Tom" value to the global name variable from local variable
	}
	
	public EmployeeTest(String name , int age, int salary) //this name is local variable
	{
		//this.global/class variable = local variable
		this.name = name;
		this.age = age;
		this.salary = salary;
		//this we use as we want to give "Tom" value to the global name variable from local variable
	}

	public static void main(String[] args) {
		
		EmployeeTest e1 = new EmployeeTest("Tom");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		EmployeeTest e2 = new EmployeeTest("John", 20, 10000);
		System.out.println(e2.name+ " " + e2.age+ " "+ e2.salary);

		
		
		
		

	}

}
