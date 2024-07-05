package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//overridden run time polymorphism
		//the BMW start method will be called here, as the object is created for BMW
		
		b.stop(); //inherited
		b.reFuel();
		b.autoParking();//individal method for BMW
		
		b.engine();//grand parent inherited property
		b.petrolEngine();//overriden method
		
		BMW.billing(); //calling static method
		
		System.out.println("----------------------");
		
		Car c = new Car();
		c.start();
		//this will call the car class start method
		
		c.reFuel();
		//this will call the car class start method
		
		c.engine();
		//inherited method
		
		c.petrolEngine();
		
		System.out.println("----------------------");
		
		Car c1 = new BMW();
		//child class object can be referred by parent class reference variable
		//It is called top casting
		
		c1.start();
		//this will call the BMW class start method
		
		c1.stop();
		//this will call the car class stop method
		
		Car.billing();//calling static method
		
		//Parent class object can be referred by child class reference variable
		//It is called down casting
		//it is supported in Java in compile time not in runtime
		//BMW b1 = (BMW) new Car(); //ClassCastException
		

	}

}
