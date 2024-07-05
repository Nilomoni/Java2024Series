package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		//Size of an array/how many values in the array
		System.out.println(a.length);
		
		
		System.out.println(Arrays.toString(a));
		
		
		String browsers [] = {"Chrome", "Edge", "Firefox"};
		for (int i = 0; i<browsers.length; i++)
		{
			System.out.println(browsers[i]);
			if(browsers[i].equals("Chrome"))
			{
				System.out.println("This is correct");
				break;
			}
		}

	}

}
