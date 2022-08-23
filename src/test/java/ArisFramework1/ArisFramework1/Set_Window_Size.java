package ArisFramework1.ArisFramework1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Window_Size {
	static WebDriver driver;
	static By by;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://lsesdc-qc-2022200.agcloud.bz/lsdms/pages/login");
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_MINUS);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_MINUS);
			Thread.sleep(2000);		
	}
}