package ClassObjectConcept;

public class MethodConcept1 {
	
	//Cannot create a function inside a function
	//Functons are independent
	//Can call the function from other function
	//function name always start with get...()
	//we can call a same function in main method multiple times
	
	
	//1. no input and no return function
	public void test ()//void function
	//function created with void will not have any return tytpe

	{
		System.out.println("Test Method");
		int i =10;//local variable
		System.out.println(i);
		
	}
	
	public void getPrint()
	{
		System.out.println("Print my paper");
	}
	
	//2. no input and have return type
	public int getBalance()
	//return type is integer
	{
		System.out.println("Get Balance");
		int fee =10;
		int tax = 5;
		int total = 10*5;
		return total;
		
		//return donot have the void
		//We need to use the return type while declaring a function or method with same as return type
		//As it is returning integer value,
		//That's why we change it to int from void
	}
	
	public String getTrainerName()
	{
		System.out.println("Get Trainer Name");
		String name = "Nilomoni";
		return name;
	}
	
	public boolean isActive()
	{
		System.out.println("Employee is still working");
		return true;
	}
	
	//3. have input and have return type
	public int add(int a, int b)
	//a,b are method parameter
	{
		int c = a+b;
		return c;
	}
	
	public int getCourseFee(String courseName)
	{
		System.out.println("Get Course fee for :" + courseName);
		
		if(courseName.equals("Java"))
		{
			return 100;
		}
		
		else if (courseName.equals("API"))
		{
			return 50;
		}
		
		else if (courseName.equals("Karate"))
		{
			return 200;
		}
		
		else
		{
			System.out.println("No COurse is there...");
			return -1;
			//When a function contain integer and string both
			//In that case we can use return type as -1 in final else part
			//Otheriwse it will display an error
		}
	}

	public static void main(String[] args) {
		//Main is also a function
		//Functions and method are same
		//They have own method body
		//main method don't have the return type
		
		MethodConcept1 obj = new MethodConcept1();
		obj.test();
		//calling the function/method
		
		//While calling a function always choose this type
		obj.getPrint();
		int p = obj.getBalance();
		//store it in integer value
		//The storing variable we can call as holding parameter which is p
		System.out.println(p);
		
		//Do not choose this type
		System.out.println(obj.getBalance());
		
		String s = obj.getTrainerName();
		System.out.println(s);
		
		if(obj.isActive())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		int s1 = obj.add(10, 20);
		//10, 20 is method argument
		System.out.println(s1);
		
		int s2 = obj.add(30, 20);
		System.out.println(s2);
		
		int course = obj.getCourseFee("Java");
		System.out.println(course);
		
		int course2 = obj.getCourseFee("Jmeter");
		System.out.println(course2);

	}

}
