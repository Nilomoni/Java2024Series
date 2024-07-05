package Encapsulaton;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private String city;
	
	
	
	//using constructor here
	
	public Employee(String name, int age, double salary, String city) 
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}
	
	
	//public getter and setter method need to create to access the private variables from main class object---->> encapsulation
	
	public void setName(String name)
	{
		this.name = name;
	}
	

	public String getName()
	{
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//Give me the age value and I'll set the same age value to global variables
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
