package javasessions;

public class Stringrevrese {

	public static void main(String[] args) {
		
		//length() and charAT() method will be use to reverse a string
		//1. How many character
		//2. Length of the string
		//3. Character position
		
		String s = "I love Automation";
		
		int length = s.length();
		//this will count and return the value of the string and that's why we initialize it as integer
		//now length = 17
		
		String rev = " ";
		//After reversing the string we'll store the string in the rev variable
		
		for(int i = length-1; i>=0; i--)
	    //as string count starts from 0, so we need to start count frm 17-1 = 16, that's why we use len-1 = 16
		//i 's first index value is 0 as string count start from 0
		//as we reverse the string that's why we need to use decrement or reverse operator
		{
			rev = rev + s.charAt(i);
			//+ is use as concatenation
			//s.charAt(i) will store the character based on the calculated index value i.e noit.....
			
		}
		
		System.out.println(rev);
		

	}

}
