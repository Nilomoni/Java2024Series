package Polymorphism;

public class PolymorphismConcept {
	
	        //Poly+Morphism
			//Many+Forms of a specific method
			//Method Overloading is also called as Polymorphism
			//Same method with different parameter
			//Method overriding is also polymorphism
			
			//overloading 
			public void Search(String ProdName)
			{
				System.out.println(ProdName);
			}
			
			public void Search()
			{
				
			}
			
			public void Search(String ProdName, int price)
			{
				
			}

	public static void main(String[] args) {
		
		PolymorphismConcept pc = new PolymorphismConcept();
		
		//overloading - Compile Time polymorphism/Static polymorphism
		pc.Search("macBook");
		//As the compiler is already taken a decision that which method it's need to call, on the basis of given parameter value. either 1/2/3
		//That's why it is called compile time polymorphism / static binding
		
		

	}

}
