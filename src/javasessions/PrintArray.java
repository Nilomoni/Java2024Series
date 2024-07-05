package javasessions;

public class PrintArray {

	public static void main(String[] args) {
		
		//1d and 2d array
		
		int a [] = {10,20,30}; //1d array
		
		//for 1d array
		for (int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------------");
		
		//for 2d array
		int b [][] = {{10,40, 50},{20,30}}; //2d array
		for(int j=0; j<b.length; j++)
		{
			for (int k=0; k<b[j].length; k++)
			{
				System.out.println(b[j][k]);
			}
			
		}

	}

}
