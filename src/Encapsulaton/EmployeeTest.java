package Encapsulaton;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Jack", 25, 34000, "Mumbai"); //this is using constructor
		
		//For constructor we need getter method to access the value
		//but in future if any value has been changed then we need to create another object which is time consuming
		//We can use setter in main method also
		
		System.out.println("The employee details is:"+" "+e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity());
		
		e1.setAge(27);
		e1.setSalary(20000);
		System.out.println("The employee updated details is:"+" "+e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity());
		
/*		e1.setName("Tom");
		String n1 = e1.getName();
		System.out.println(n1);
		
		e1.setAge(23);
		int a1 = e1.getAge();
		System.out.println(a1);
		
		e1.setSalary(2000.43);
		double s1 = e1.getSalary();
		System.out.println(s1);
		
		e1.setCity("Asansol");
		String c1 = e1.getCity();
		System.out.println(c1);
		
		System.out.println("The employee details is:"+" "+e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.getCity());*/
		

	}

}
