package AbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageloadtime();
		lp.forgotPassword();
		lp.displayLogo();
		LoginPage.footer();
		System.out.println("-------");
		
		//child class object can be referred by parent abstrcat class reference
		//top casting
		page p = new LoginPage();
		p.title();
		p.url();
		p.pageloadtime();
		p.displayLogo();
		page.footer();
		
		//LoginPage lp1 = new page();
		//downcasting is not possible
		

	}

}
