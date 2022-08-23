package ArisFramework1.ArisFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	public WebDriver driver;
 public GoogleSearchPage(WebDriver driver) 
 {
	 super();
	 this.driver=driver;
 }
  By searchtime=By.id("result-stats");
 public WebElement SearchedTime() {
	return driver.findElement(searchtime);
	 
 }
 
}
