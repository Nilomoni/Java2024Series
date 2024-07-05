package javasessions;

import java.util.Arrays;

public class StringArrayConcept {

	public static void main(String[] args) {
		
		String emp [] = new String [3];
		emp[0] = "Ravi";
		emp[1] = "Pooja";
		emp[2] = "Robin";
		
		//for only print the array
		
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
		
		//To check the salary of an particular employee
		//In this way we can check a single page from 100...of page in selenium
		for(int i=0; i<emp.length; i++)
		{
			System.out.println(emp[i]);
			
			if(emp[i].equals("Pooja"))
			{
				System.out.println("Correct employee");
				break;
			}
			
		}
		

	}

}
