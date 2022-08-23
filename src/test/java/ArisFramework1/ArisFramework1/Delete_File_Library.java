package ArisFramework1.ArisFramework1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Delete_File_Library {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("https://lseasydocs-preval.agcloud.bz/lsdms/pages/login");
		Thread.sleep(2000);
		driver.findElement(By.id("userNameTxt")).sendKeys("Tenant2admin");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordTxt")).sendKeys("Password2!");
		Thread.sleep(2000);
		WebElement tenantselect=driver.findElement(By.id("agl-tenant-switcher"));
		Select tenant=new Select(tenantselect);
		tenant.selectByVisibleText("Tenant2");
		Thread.sleep(2000);
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
		if((driver.findElement(By.id("popup_ok")).isDisplayed())){
		driver.findElement(By.id("popup_ok")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lsdms_library\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='cbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("C889-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("C885")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("popup_ok")).click();
		Thread.sleep(2000);
		String Msg=driver.findElement(By.xpath("//*[@id=\"agl-infomsg-cont\"]/div[2]")).getText();
		if(Msg.contains("moved")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		driver.findElement(By.id("agl-user-icn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sign Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("agl-confirm-yes")).click();
		Thread.sleep(2000);	
		driver.close();
		
		}
	}
}
