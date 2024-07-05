package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//1. with new keyword declare array
		int a[] = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a[3]);
		System.out.println("------------------");
		
		//size of the array
		int len = a.length;
		System.out.println(len);
		int hi = len-1;
		System.out.println(hi);
		
		System.out.println("------------------");
		
		//print all the values from the array (static)
		//for (int i=0; i<4; i++)
		for (int e: a)
		{
			//System.out.println(a[i]);
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		//print all the values from the array (dynamic)
				for (int i=0; i<a.length; i++)
				{
					System.out.println(a[i]);
				}
				
				System.out.println("------------");
				
				//without for loop
				
				//System.out.println(a); //[I@4517d9a3
				
				System.out.println(Arrays.toString(a));
				
		

	}

}
