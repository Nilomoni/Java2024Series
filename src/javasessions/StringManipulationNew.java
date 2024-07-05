package javasessions;

public class StringManipulationNew {

	public static void main(String[] args) {
		
		//== operators and .equals method
		
		String s1 = new String ("Nil");
		String s2 = new String ("Nil");
		
		System.out.println(s1==s2);
		
		System.out.println("+++++++++++++++++++");
		
		String s3 = "Nil";
		String s4 = "Nil";
		System.out.println(s3==s4);
		
		System.out.println("+++++++++++++++++++");
		
		//String Compare equals()-- always return boolean
		
		String s5 = "Nilo";
		String s6 = "Amit";
		
		System.out.println(s5.equals(s6));
		//To check the string is empty or not by using equal method
		System.out.println(s5.equals(""));
		
		System.out.println("+++++++++++++++++++");
		
		//String Compare equalsIgnorecase()-- always return boolean
		
		String s7 = "Nilo";
		String s8 = "nilo";
		System.out.println(s7.equalsIgnoreCase(s8));
		
		System.out.println("+++++++++++++++++++");
		
		//String Compare with CompareTo()-- always return integer value
		String s9 = "a";
		String s10 = "z";
		System.out.println(s9.compareTo(s10));
		
		System.out.println("+++++++++++++++++++");
		
		//String Compare with CompareToIgnoreCase()-- always return integer value
		String s11 = "abc";
		String s12 = "ABC";
		System.out.println(s11.compareToIgnoreCase(s12));
		
		System.out.println("+++++++++++++++++++");
		
		//String replace with Replace()-- always replace all the matching word with the replcae word
		String s13 = "I love Java";
		System.out.println(s13.replace("love", "don't love"));
		System.out.println(s13.replace("a", "b"));
		
		System.out.println("+++++++++++++++++++");
		
		//String replace with ReplaceFirst()-- always replace the first matching word with the replacing word
		System.out.println(s13.replaceFirst("a", "b"));
		
		System.out.println("+++++++++++++++++++");
		
		//String replace with ReplaceAll()--
	    System.out.println(s13.replaceAll("love", "lov"));
		System.out.println(s13.replace("love(.)", "lov"));
		
		
		
		

	}

}
