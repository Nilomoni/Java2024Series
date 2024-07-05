package BuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {

		Shopping shop = new Shopping();

		// sc1
		shop.login("noman@gmail.co.in", "noman@123").search("t-shirt").addToCart("t-shirt").doPayment("1234", 1234)
				.generateOrder().logout();
		
		System.out.println("+++++++++++++++++++++++++");
		
		// sc2
		shop.login("noman@gmail.com", "noman@123").search("macBook").addToCart("macBook").logout();
		
		System.out.println("+++++++++++++++++++++++++");
		
		//sc3
		shop.login("noman@gmail.com", "noman@123").doPayment("1234", 123).generateOrder().logout();
		
		System.out.println("+++++++++++++++++++++++++");
		
		//sc4
		shop.login("noman@gmail.com", "noman@123").logout();
		
		System.out.println("+++++++++++++++++++++++++");
		shop.logout().login("noman@gmail.com", "noman@123").logout();

	}

}
