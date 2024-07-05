package ClassObjectConcept;

import java.util.ArrayList;

public class MethodConcept2 {
	
	//Write a function - To supply a browser name
	//launch the browser
	//return tru if browser launch
	
	public boolean launchBrowser(String browserName)
	{
		System.out.println("Browser name is :" + browserName);
		boolean flag = true;
		
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launched Chrome");
			
			break;

		case "firefox":
			System.out.println("Launched Firefox");
			break;

		case "edge":
			System.out.println("Launched Edge");
			break;
			

		default:
			System.out.println("Please pass the right browser :" + browserName);
			flag = false;
			break;
		}
		
		return flag;
	}
	
	//This is allowed as we didn't return anything
	public void testing()
	{
		System.out.println("Testing method");
		return;
	}
	
	//WAF
	//input = Compnay name (String)
	//return the list of employess of the company : Arraylist<String>
	
	//as retrun type is arraylist thats why ArrayList<String> replaced the void
	public ArrayList<String> getEmployeeList(String compName)
	{
		System.out.println("Company name is :" + compName);
		
		ArrayList<String> empList = new ArrayList<String>(); //current pc = 0
		if(compName.equalsIgnoreCase("IBM"))
		{
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
		}
		
		else if(compName.equalsIgnoreCase("CTS"))
		{
			empList.add("Nil");
			empList.add("Soumili");
			empList.add("Nilomoni");
		}
		
		else if(compName.equalsIgnoreCase("Google"))
		{
			empList.add("John");
			empList.add("Elton");
			
		}
		
		else
		{
			System.out.println("Company name is not found");
		}
		
		return empList;
	}

	public static void main(String[] args) {
		
		MethodConcept2 mc2 = new MethodConcept2();
		boolean b = mc2.launchBrowser("ie");
		if(b==true)
		{
			System.out.println("Enter the url...");
		}
		
		else
		{
			System.out.println("Check the browser");
		}
		System.out.println("+++++++++++++++++++");
		
		ArrayList<String> empl = mc2.getEmployeeList("eee");
		System.out.println(empl);
		System.out.println(empl.size());
	

	}

}
