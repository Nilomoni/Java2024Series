package ArrayListConcept;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		//Create the object of Arraylist class
		
		ArrayList ar = new ArrayList();
		
		ar.add(100); //0th position
		ar.add(200); //1st position
		
		System.out.println(ar.size()); //Returns the current size of the arraylist
		//This is like .length method
		
		ar.add(500); //2nd position
		ar.add(600); //3rd position
		System.out.println(ar.size());
		
		//Get the index value
		System.out.println(ar.get(3));
		//System.out.println(ar.get(5));
		
		//Generics in Arraylist
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		System.out.println(marksList.size());
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(45.89);
		bmiList.add(100.00);
		System.out.println(bmiList.size());
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("Chrome");
		browserList.add("Firefox");
		browserList.add("Safari");
		System.out.println(browserList.size());
		
		System.out.println(browserList.get(2));
		
		System.out.println(browserList);
		
		//Get all the values using for loop
		for(int i=0; i<browserList.size(); i++)
		{
			System.out.println(browserList.get(i));
		}
		
		System.out.println("+++++++++++++++++");
		
		//for each
		for(String e:browserList)
		{
			System.out.println(e);
		}
		
		System.out.println("+++++++++++++++++++");
		
		//emp info : name - String, age - int, Salary - int
		
		ArrayList<Object> empinfoList = new ArrayList<Object>();
		empinfoList.add("Nilomoni");
		empinfoList.add("Bhattacherjee");
		empinfoList.add(37);
		empinfoList.add(30000);
		empinfoList.add("Pune");
		empinfoList.add("Male");
		empinfoList.add("True");
		System.out.println(empinfoList.size());
		System.out.println(empinfoList);
		
		System.out.println("++++++++++++++++++++++");
		
		for (Object e : empinfoList)
		{
			System.out.println(e);
		}
		
		
	}

}
