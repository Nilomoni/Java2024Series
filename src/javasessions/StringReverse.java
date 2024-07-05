package javasessions;

public class StringReverse {

	public static void main(String[] args) {
		
		
		  String s = "madam"; 
		  String rev = "";
		  
		  for(int i=s.length()-1; i>=0; i--) 
			  
		  {
			  rev = rev+s.charAt(i); 
		  }
		  
		  System.out.println(rev);
		  
		//String palindrome checking
		  if(s.equals(rev))
			{	
				System.out.println("Palindrome String");
			}
			else
			{
				System.out.println("Not a Palindrome String");
			}
		  
		  System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		 
		
		String s1 = "Madam";
		String rev1 = "";
		for (int j = s1.length()-1; j>=0; j--)
		{
			rev1 = rev1+s1.charAt(j);
			
		}
		//System.out.println(rev1);
		
		
		
		
		

	}

}
