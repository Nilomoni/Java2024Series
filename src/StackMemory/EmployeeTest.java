package StackMemory;

public class EmployeeTest {
	
	String name;
	int age;
	
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void printmsg()
	{
		System.out.println("Hello Java");
	}
	
	public void getEmpInfo(EmployeeTest e)
	
	{
		e.name = "Nil";
		e.age = 30;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
		
		EmployeeTest et = new EmployeeTest();
		
		//This is call by value/arguement
		et.add(10, 20);
		et.printmsg();
		
		et.getEmpInfo(et);//call by reference
		//we are calling the getEmpInfo() method by passing the EmployeeTest object reference created
		//So we created the same class parameter like EmployeeTest
		//And et is given to e
		//as the type of et is EmployeeTest and that's why e should have the same arguement as EmployeeTest 
		//and the datatype type of et is EmployeeTest
		//it's just like 10 is integer type and assign to a
		//and same as b is integer type so 20 is assign to b

	}

}
