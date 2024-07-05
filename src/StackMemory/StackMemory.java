package StackMemory;

public class StackMemory {
	
	
	//Non Static -calling--> Non Static -- Yes (No Object need to create)
	//Static -calling--> Static -- Yes (No Object need to create)
	//Non Static -calling--> Static -- Yes (Directly/by classname) (No Object need to create)
	//Static -calling--> Non Static -- Yes (Object need to create)
	
	
	public static void t1()
	{
		System.out.println("Static t1 method");
		t2();
		
	}
	
	public static void t2()
	{
		System.out.println("Static t2 method");
	}
	
	public void m1()
	{
		System.out.println("m1 method");
		
	//calling m2 from m1 without creating object
		m2();
	}
	
	public void m2()
	{
		System.out.println("m2 method");
		
	//calling m3 from m2 without creating object
		m3();
	}
	
	public void m3()
	{
		System.out.println("m3 method");
		t1();
		//or
		StackMemory.t1();
	}

	public static void main(String[] args) {
		
		StackMemory st = new StackMemory();
		//t1();
		st.m1();

	}

}
