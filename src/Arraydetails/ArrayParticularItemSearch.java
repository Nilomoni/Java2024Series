package Arraydetails;

public class ArrayParticularItemSearch {

	public static void main(String[] args) {
		
		int a[]= {4,6,8,1,2,9,12}; //int array
		
		int item = 9;
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("Item is present at" + i + "index Position");
			}
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		String s []= {"d","a","n","y","t","h"};
		String str = "z";
		int temp = 0;
		for(int j=0;j<s.length;j++)
		{
			if(s[j]==str)
			{
				System.out.println("Item is present at" + j + "index Position");
				temp = 0+1;
			}
			else
			{
				System.out.println("Item is not in list");
			}
		}

	}

}
