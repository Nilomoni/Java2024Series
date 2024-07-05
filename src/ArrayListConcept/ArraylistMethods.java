package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> empinfoList = new ArrayList<Integer>(20);
		//vc = 20, pc =0
		//lf = 20/2=10
		//VC by default will be 10, but if arraylist value assigned then it'll take that as virtual capacity
		//Here vc is 20 for that reason
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		//vc = 10, pc = 0
		//lf = 10/2=5
		numList.add(100);//0
		numList.add(200);//1
		numList.add(300);//2
		numList.add(400);//3
		System.out.println(numList.size());
		
		//remove value from arraylist is only possible by passing the index value only
		numList.remove(2);
		numList.get(2);
		System.out.println(numList.size());
		System.out.println(numList.get(2));
		
		
		
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "Nilo" , "Ravi"));
		//We can use Arrays.asList to add multiple values in a single line
		//rather than using .add method
		
		System.out.println(empList.size());
		System.out.println(empList);
		empList.add("Nilomoni");
		System.out.println(empList);
		
		//Add value along with index position
		empList.add(0, "Jatin");
		System.out.println(empList);
		
		//Declare arraylist in another way
		List <Integer> num = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(num);
		
		List <String> pageList = Arrays.asList("Login" , "HomePage", "Cart Page", "Contact Us");
		
		//Sort arraylist
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nList.add(100);//0
		nList.add(200);//1
		nList.add(10);//2
		nList.add(4000);//3
		nList.add(40);//4
		
		System.out.println(nList);
		Collections.sort(nList);
		System.out.println(nList);
		
		//Print reverse order after sorting
		Collections.reverse(nList);
		System.out.println(nList);
		
		//normal array sorting
		int test []= {10,300,45,89,2000,23,34};
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		System.out.println("++++++++++++++++++");
		
		//Assignment ---- > Sort with the for loop the array list
		
		//To store same value as per the list size provided
		//If we want to create same copies of the same value
		ArrayList <String> myList = new ArrayList <String> (Collections.nCopies(5, "iPhone"));
		System.out.println(myList.size());
		System.out.println(myList);
		
		
		
		
		
		
		

	}

}
