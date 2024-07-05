package javasessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "This is my Java Code and I am so happy";
		
		//calculate length
		
		System.out.println(str.length());
		
		int len = str.length(); //38
		int li = 0; //li = lowest index
		System.out.println(li);
		int hi = len-1; //hi - highest index
		System.out.println(hi);
		
		System.out.println(str.charAt(2));
		//char at will return the specific index value available in the string
		
		//System.out.println(str.charAt(40));
		//StringIndexOutOfBoundsException as no index value in 40
		
		System.out.println(str.indexOf('y'));
		//index of always give the value of first occurrence value in the string if same character is present multiple 
		//times
		
		System.out.println(str.indexOf('y', 11));
		//This index of will return the next 
		
		                //or
		System.out.println(str.indexOf("y", str.indexOf('y')+1));
		
		System.out.println(str.indexOf("s", str.indexOf('s')+7));
		//This will print the 3rd occurrence position of s
		
		System.out.println(str.indexOf("my"));
		
		System.out.println(str.indexOf("Hello")); //-1
		
		//Print the string "Admin" if it's present in the success message
		
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin")>=0)
		{
			System.out.println("Correct Message");
		}
		
		else
		{
			System.out.println("Wrong Message");
		}
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//trim a string
		
		String s = "      hello World    ";
		System.out.println(s.trim());
		
		//replace
		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));
		//replace method will help to replace the character as well as specific string
		
		//contains
		String s2 = "WelCome admin";
		if(s2.contains("admin"))
		{
			System.out.println("Correct Message");
		}
		
		else
		{
			System.out.println("Wrong Message");
		}
		
		//Or
		
		System.out.println(s2.contains("admin"));
		
		
		//Concat
		
		String s11 = "Hello";
		String s12 = "Hello Selenium";
		
		System.out.println(s11.concat(" ").concat(s12).concat(" ").concat("Hello Automation"));
		
		//Comparison
		
		String s3 = "My Java Code";
		String s4 = "My java Code";
		
		System.out.println(s3.equals(s4));
		//equals is not work on case sensitive
		
		System.out.println(s3.equalsIgnoreCase(s4));
		//equalsIgnoreCase can wrok on case sensitive also but not on extra space if any
		
		//substring - is use to fetch out small string from a largest string
		
		String s5 = "This is my String class 12345";
		System.out.println(s5.substring(11));
		//substring(beginindex) will always count the index value provided
		
		System.out.println(s5.substring(0, 9));
		//substring(beginindex, endindex) - Method will always count from bindex to eindex-1
		
		//only fetch 12345 from the string
		//this code will always use to fecth a substring from a longest string
		System.out.println(s5.substring(s5.indexOf("class")+6, s5.length()));
		//length will always length-1
		
		//split - This method will remove the value which wnat to split
		String test = "Java;Python;Javascript;Ruby";
		//As split always return string array so we need to store the value in String array
		String arr[] = test.split(";");
		//Then run a for loop to print the split string
		for(String e : arr)
		{
			System.out.println(e);
		}
		
		//output of the following
		String data = "xXtestingXxXxJavaxXselenium";
		String dataArr[]= data.split("xX");
		System.out.println("0th value: " + dataArr[0]);
		
		
		
		String x = "100";
		System.out.println(x+20);//10020
		
		//Convert it in 120
		//Convert string to integer
		int i = Integer.parseInt(x); //i =100 over here as it converted the string to integer
		System.out.println(i+20);
		
		
		  String y = "200testing"; 
		  System.out.println(y+20);
		  String arr1[] = y.split("testing");
		  for(String e : arr1)
			{
				System.out.println(e);
				int i1 = Integer.parseInt(e);
				System.out.println(i1+20);
			}

	}

}
