package HashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		
		//Created a HashMap object
		//Object reference name is empMap 
		
		HashMap<String, String> empMap = new HashMap <String,String> (); 
		
		//Assign value in hashmap using put() method. It is just like add() in arraylist
		//HasMap never maintain indexing/order while printing any values
		//It is orderless collection
		
		empMap.put("A", "Nilo");
		empMap.put("B", "Test");
		empMap.put("C", "Gappu");
		empMap.put("D", "Soumili");
		//To get a specific position value in HashMap we use .get("key value") method
		System.out.println(empMap.get("D"));
		
		System.out.println("+++++++++++++++++++++");
		
		HashMap<String, Integer> studentMap = new HashMap <String,Integer> (); 
		
		studentMap.put("Tom", 10);
		studentMap.put("Harry", 20);
		studentMap.put("Peter", 30);
		studentMap.put("Johnson", 45);
		studentMap.put("Zenith", 51);
		studentMap.put("Null", 7);
		
		//Traverse a hashMap by using lambda and foreach method
		
		studentMap.forEach((k,v)-> System.out.println(k + ":" +v));
		//k is representing the key and v is for value
	    //-> - is for Lamda
	   //lambda arrow means supply k and v to the next statement and that is System.out.println and pass the k and v to this System.out.println 
		
		System.out.println("+++++++++++++++++++++");
		
		//Duplicate value is not allowed in HashMap, as it's always givs latest value
		//get() method is also use to get the key
		System.out.println(studentMap.get("Peter"));
		
		//keySet() method will return the set of keys in hashmaps
		System.out.println(studentMap.keySet());
		
		
		System.out.println("+++++++++++++++++++++");
		
		//Hasmap will not throw any exception if the value is not available
		System.out.println(studentMap.get("Sun"));
		
		System.out.println("+++++++++++++++++++++");
		
		HashMap<Integer, Integer> i = new HashMap <Integer,Integer> (); 
		i.put(1, 1);
		i.put(2, 2);
		
		HashMap<Integer, String> userMap = new HashMap <Integer, String> (); 
		userMap.put(001, "Tom");
		userMap.put(002, "Nil");
		userMap.put(003, "Soumili");
		
		
		
		
		
		

		

	}

}
