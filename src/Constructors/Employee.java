package Constructors;

public class Employee {
	
	
	String name;
	int age;
	double salary;
	
	
	//Const name should be same as class name
	//It doesn't have any return value
	//It cannot be void also
	//Const..will be created when the object is created
	//const..can be overloaded
	//system class have private constructor
	//for that we cannot create system class object
	public Employee () //0 parameter constructor
	{
		System.out.println("This is default constructor");
	}
	
	public Employee(int i) //1 parameterized constructor
	{
		System.out.println("This is single parameter const..." +i);
	}
	
	public Employee(int i, String P) //2 parameterized constructor
	{
		System.out.println("This is double parameter const..." +i + P);
	}
	

	public static void main(String[] args) {
		
		Employee obj = new Employee(); //this will called the default constructor
		obj.name = "tom";
		obj.age = 20;
		obj.salary = 12.33;
		
		Employee obj1 = new Employee(10); //this will called the single parameter constructor
		
		Employee obj2 = new Employee(10 , "Testing"); //this will called the double parameter constructor

	}

}
