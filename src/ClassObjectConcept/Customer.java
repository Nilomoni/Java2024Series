package ClassObjectConcept;

import java.util.ArrayList;

public class Customer {
	
	public ArrayList<String> doSearch(String productName)
	{
		System.out.println("Searching the product :" + productName);
		
		ArrayList<String> prodList = new ArrayList<String>();
		
		
		switch (productName)
		{
		case "Apple":
			prodList.add("iPhone12");
			prodList.add("iPhone15");
			prodList.add("iPhone13");
			break;
		
		case "Samsung":
			prodList.add("Smasung S8");
			prodList.add("Smasung m54");
			prodList.add("Samsung s12");
			break;
			
		case "Nokia":
			prodList.add("Nokia n93");
			prodList.add("Nokia n21");
			prodList.add("Nokia n90");
			break;
			
			default: 
			System.out.println("Product not found...:" + productName);
			break;
						
		}
		
		return prodList;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		ArrayList<String> s1 = c1.doSearch("Samsung");
		System.out.println(s1.size());
		System.out.println(s1);
		
		ArrayList<String> s2 = c1.doSearch("Xiomi");
		System.out.println(s2.size());
		System.out.println(s2);
		

	}

}
