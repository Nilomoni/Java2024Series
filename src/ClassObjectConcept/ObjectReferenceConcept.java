package ClassObjectConcept;

public class ObjectReferenceConcept {
	
	//class data members
	
	//Class variable
	String name;
	int age;
	
	//class method
	public void getMethod()
	{
		System.out.println("get method");
	}

	public static void main(String[] args) {
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
		// obj = null; == null pointer exception, as object reference is pointing to null
		
		 obj.name = "tom"; 
		 obj.age = 25;
		
		//no reference object ==> as objects are created but no reference is there
		new ObjectReferenceConcept().name = "Tom";
		new ObjectReferenceConcept().age = 24;
		new ObjectReferenceConcept().getMethod();
		
		//garbage collector will destroy all the null reference or no reference 
		//here sysem is a class
		System.gc();
		

	}

}
