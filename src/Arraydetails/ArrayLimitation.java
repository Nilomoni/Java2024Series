package Arraydetails;

import java.util.Arrays;

public class ArrayLimitation {

	public static void main(String[] args) {
		
		int product[] = new int [1];
		product [0] = 1;
		//product [1] = 2;
		
		Object emp [] = new Object[3];  //Object array can store different data type array
		emp [0] = 30;
		emp [1] = "Tom";
		emp [2] = 3450.65;
		System.out.println(Arrays.toString(emp));
		System.out.println(Arrays.toString(product));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		//Print integer array in reverse order
		
		int a[] = new int [4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		for(int i = a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("----------");
		
		Object emp1 [] = new Object[3];
		emp1 [0] = 30;
		emp1 [1] = "Tom";
		emp1 [2] = 3450.65;
		for(int j = emp1.length-1; j>=0; j--)
		{
			System.out.println(emp1[j]);
		}
		
		

	}

}
