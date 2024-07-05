package WebDriver_Arch_Interface;

public class Amazon {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFoxDriver driver = new FireFoxDriver();
		
		//maintain driver reference and just need to change the borwser name
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("Firefox"))
		{
			driver = new FireFoxDriver();
		}
		
		else
		{
			System.out.println("Please pass the right borwser");
		}
		
		driver.get("https://www.amazon.co.in");
		String title = driver.getTitle();
		System.out.println("Page title is :" + title);
		driver.findElement("email id");
		driver.sendKeys("email", "test@test.com");
		driver.findElement("login button");
		driver.click("login button");
		
		

	}

}
