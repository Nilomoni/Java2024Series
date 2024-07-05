package BuilderPattern;

public class Shopping {
	
	public Shopping login()
	{
		System.out.println("Login to app");
		return this;
		//as this means current class object
		//that's why return type is Shopping
	}
	
	public Shopping login(String un, String pwd)
	{
		System.out.println("Login to app with :" +un + " " + pwd);
		return this;
	}
	
	public Shopping search()
	{
		System.out.println("search a product");
		return this;
	}
	
	public Shopping search(String prodName)
	{
		System.out.println("search a product with :" + prodName);
		return this;
	}
	
	public Shopping addToCart(String name)
	{
		System.out.println("adding to cart:" + name);
		return this;
	}
	
	
	public Shopping doPayment(String cc , int cvv)
	{
		System.out.println("making payment with : " + cc + " " + cvv);
		return this;
	}
	
	public Shopping generateOrder()
	{
		System.out.println("Order id is 12345");
		return this;
	}
	
	public Shopping logout()
	{
		System.out.println("Logout successfully");
		return this;
	}

}
