package HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> CompMap= new HashMap<String, Integer>();
		CompMap.put("Google", 10000);
		CompMap.put("Walmart", 20000);
		CompMap.put("Amazon", 30000);
		CompMap.put("Meta", 3000);
		
		System.out.println(CompMap.size());
		
		System.out.println("+++++++++++++++++");
		
		Iterator it = CompMap.entrySet().iterator();
		//entrySet returns a set of Map.Entry objects, each containing a key-value pair
		while (it.hasNext())
		//The while loop iterates through the entries, and for each entry, it prints the key and value
		{
			Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey()+ "="+ pairs.getValue());
		}
		
		System.out.println("++++++++++++++++++++");
		
		//Convert the keys into arraylist
		List<String> CompnameList = new ArrayList<String>(CompMap.keySet());
		//The keys of the CompMap are converted to an ArrayList named CompnameList
		//keySet() returns a set of all keys in the CompMap
		System.out.println(CompnameList);
		
		System.out.println("++++++++++++++++++++");
		
		//Convert the values into arraylist
		List<Integer> EmpValues = new ArrayList<Integer>(CompMap.values());
		//values() returns a collection of all values in the CompMap
		System.out.println(EmpValues);

	}

}
