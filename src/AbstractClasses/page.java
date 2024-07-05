package AbstractClasses;

//By writing "abstract" a class is abstract class
public abstract class page {
	
	//cannot create the object of abstract class
	
	//Constructor can be created for abstract class
	//In abstract class java will always allow only the default const if more than one or only one const.. is available in parent class
	//Always parent const..will be called first when the child class object has been created
	//this const.. will be caleed when we create the object of child class
	public page()
	{
		System.out.println("Page constructor");
	}
	
	public page(int i)
	{
		System.out.println("One param constructor:" +i);
	}
	
	public abstract void title();
	//need to use abstract keyword while writing a method in abstract class without body
	public abstract void url();
	
	public void pageloadtime() 
	
	{
		System.out.println("Page timeout ----10 sec");
	}
	
	public final void displayLogo()
	{
		System.out.println("Page logo");
	}
	
	public static void footer()
	{
		System.out.println("Page footer");
	}
	
	
	

}
