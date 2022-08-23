package ArisFramework1.ArisFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	public WebDriver driver;
 public GoogleHomePage(WebDriver driver) 
 {
	 super();
	 this.driver=driver;
 }
  By searchdata=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
  By searchbutton=By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]");
  
 public WebElement Searchdata() {
	return driver.findElement(searchdata);
	 
 }
 
 public WebElement searchbutton() {
		return driver.findElement(searchbutton);
		 }
}
