package ClassObjectConcept;

public class ClassAndObject {
	
	int i =20; //Class Variable
	String name; //Class Variable
	int age; //Class Variable
	String city; //Class Variable
	double salary; //Class Variable

	public static void main(String[] args) {
		
		int i = 10;//local variable
		System.out.println(i);
		
		//Create object of the class : use new keyword to call the global/class variable
		
		ClassAndObject obj = new ClassAndObject();
		//obj is the object reference name which refering new ClassAndObject()
		//new ClassAndObject() is the object
		//ClassAndObject is the class / type of obj
		//ClassAndObject is non-primitve data type
		
		obj.name = "Nilomoni"; 
		obj.age = 20;
		obj.city = "Pune";
		obj.salary = 20000;
		//Whenever need to assign the values, 
		//need to use obj reference name.class variable
		
		System.out.println(obj.i);
		//through obj.i, it can access all the variables inside the class body without main method
		
		System.out.println(obj.name + " " + obj.age + " " + obj.city + " " + obj.salary);
		//for fetch the value same we need to obj reference name.class variable
		

	}

}
