package ClassObjectConcept;

public class OverloadingRealConcept {

	public void logIn() {

	}

	public void logIn(String un, String pwd) {
		

	}

	public void logIn(String un, String pwd, String role) {

	}

	public void logIn(String un, String pwd, int id) {

	}

	public void search() {

	}

	public void search(String prodName) {

	}

	public void search(String prodName, int prodId) {

	}

	public void search(int prodId, int price) {

	}

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public static void main(String[] args) {

		OverloadingRealConcept orc = new OverloadingRealConcept();
		orc.logIn("nilomoni@test.com", "12345");
		orc.doPayment("1234-5678-9012-0987", 123);

	}

}
