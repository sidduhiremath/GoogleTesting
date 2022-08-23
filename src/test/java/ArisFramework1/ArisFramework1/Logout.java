package ArisFramework1.ArisFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	public WebDriver driver;
Logout(WebDriver driver){
	this.driver=driver;
}

public void logout(WebDriver driver) throws InterruptedException {
	driver.findElement(By.id("agl-user-icn")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Sign Out']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("agl-confirm-yes")).click();

	Thread.sleep(2000);
}
}
