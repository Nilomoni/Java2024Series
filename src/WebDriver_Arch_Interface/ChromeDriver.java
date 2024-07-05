package WebDriver_Arch_Interface;

public class ChromeDriver implements WebDriver{
	
	//const..
	public ChromeDriver()
	{
		System.out.println("Launch Chrome Browser");
	}

	@Override
	public void get(String url) {
		
		System.out.println("Enter the url :" + url);
		
	}

	@Override
	public String getTitle() {
		
		return "amazon";
	}

	@Override
	public void click(String element) {
		
		System.out.println("Click on Element");
	}

	@Override
	public void sendKeys(String element, String value) {
		
		System.out.println("Entering " + value + "into" + element);
	}

	@Override
	public void close() {
		
		System.out.println("Close Browser");
	}

	@Override
	public void findElement(String element) {
		
		System.out.println("Finding element by using :" + element);
	}

}
