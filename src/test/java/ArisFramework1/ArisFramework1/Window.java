package ArisFramework1.ArisFramework1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	static WebDriver driver;
	static By by;
	public static Robot robot;
	public static void main(String a[]) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("https://www.google.com");
		driver.manage().window().maximize();
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Set<String> ids=driver.getWindowHandles();
		String s=driver.getWindowHandle();
		for(String i:ids)
		if(!(s.equalsIgnoreCase(i)))
		driver.switchTo().window(i);
		driver.get("https://www.google.com");
}
}
