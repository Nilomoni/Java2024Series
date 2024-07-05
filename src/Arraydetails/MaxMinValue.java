package Arraydetails;

public class MaxMinValue {

	public static void main(String[] args) {
		
		int a [] = {34,89,98,-87,-88,102};
		int max = a[0];
		int min = a[0];
		
		for(int i=1; i<a.length; i++) //for traverse the array from 0-5 index
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			else if(a[i] < min)
			{
				min = a[i];
			}
			
		}
		
		//System.out.println("given array is :" + Arrays.toString(a));
		System.out.println("Large number is ::" +max);
		System.out.println("Small number is ::" +min);

	}

}
