package Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioService();
		fh.mediclaimService();
		fh.ambulanceService();
		
		//Medical
		fh.rdmedical();
		
		//top casting : child class object can be referred by parent interface reference variable
		//on top casting we cannot access other interface method
		//top casting is supported by interface but it'll limited to that interface thorogh which we created the child class object
		USMedical us = new FortisHospital();
		us.gastroService();
		
		//down casting not supported in interface
		//FortisHospital fh = new USMedical();
		
		//top casting with grand parents
		WHO wh = new FortisHospital();
		wh.vaccination();
		
		//calling static method by interface name not by class name
		USMedical.billing();
		FortisHospital.billing();
		
		//calling default/non-static method by interface name is not possible
		//It is possible only by object name
	
		fh.medicalTest();
		us.medicalTest();
		fh.reportSection();
		
		//calling variable use by the interface name
		System.out.println(USMedical.min_fee);
		
		//for fortis it is class level variable that'why need to call it by object
		System.out.println(fh.min_fee);
		System.out.println(FortisHospital.min_fee);
		

	}

}
