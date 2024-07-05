package javasessions;

public class FindVowels {

	public static void main(String[] args) {
		
		//length() and charAT() method will be use to reverse a string
		//1. How many character
		//2. Length of the string
		//3. Character position
		
		String str = "I love Automation";
		
		for (int i = 0; i<str.length(); i++)
		{
			char ch = Character.toLowerCase(str.charAt(i));
			if (ch=='a'||ch== 'e' || ch== 'i'|| ch=='o'|| ch=='u')
					{
				      System.out.println("vowels present "+ch + " at index" +i);
				
					}
		}
		
	}

}
