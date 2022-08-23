package ArisFramework1.ArisFramework1;

import org.testng.annotations.Test;
	
public class Tc01 extends Base {	
	Screenshot ss;
	@Test
public void Tc01() throws Exception{
	 ss=new Screenshot();
	
	driver=Lunchbrowser();
	driver.get(properties.getProperty("vURL"));
	ss.screenshots("Home");
	GoogleHomePage ghp=new GoogleHomePage(driver);
	ghp.Searchdata().sendKeys("Selenium");
	Thread.sleep(2000);
	ghp.searchbutton().click();
	
	Thread.sleep(2000);
	ss.screenshots("Selenium");
	GoogleSearchPage gsp=new GoogleSearchPage(driver);
	String time=gsp.SearchedTime().getText();
	System.out.println("Time taken is "+time);
	Thread.sleep(2000);
	driver.navigate().to("https://accounts.google.com");
	Thread.sleep(2000);
	ss.screenshots("Email");
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.close();
	
	
}
	@Test
	public void Tc02() throws Exception{
		driver=Lunchbrowser();
		driver.get(properties.getProperty("vURL"));
		ss.screenshots("Email");
		GoogleHomePage ghp=new GoogleHomePage(driver);
		ghp.Searchdata().sendKeys("Selenium");
		Thread.sleep(2000);
		ghp.searchbutton().click();
		ss.screenshots("Email");

		Thread.sleep(2000);
		
		GoogleSearchPage gsp=new GoogleSearchPage(driver);
		ss.screenshots("Email");

		String time=gsp.SearchedTime().getText();
		System.out.println("Time taken is "+time);
		driver.close();
	
	}
}
