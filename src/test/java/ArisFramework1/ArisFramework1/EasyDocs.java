package ArisFramework1.ArisFramework1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;

public class EasyDocs {
	static WebDriver driver;
	static By by;
	public static Robot robot;
public static void main(String a[]) throws InterruptedException, Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://lsesdc-qc-2022200.agcloud.bz/lsdms/pages/login");
	Thread.sleep(2000);
	driver.findElement(By.id("userNameTxt")).sendKeys("sidduh");
	Thread.sleep(2000);
	driver.findElement(By.id("passwordTxt")).sendKeys("Password2#");
	Thread.sleep(2000);
	WebElement tenantselect=driver.findElement(By.id("agl-tenant-switcher"));
	Select tenant=new Select(tenantselect);
	tenant.selectByVisibleText("ETMF104QC");
	Thread.sleep(2000);
	driver.findElement(By.className("login-button")).click();
	Thread.sleep(2000);
	ExtentReporterNG er=new ExtentReporterNG();
	er.generatereport(null, null, System.getProperty("user.dir")+"C:\\Users\\00005110\\eclipse-workspace\\ArisFramework1\\Reports\\htmlreport.html");

	if(driver.findElement(By.id("popup_title")).isDisplayed()) {
	driver.findElement(By.id("popup_ok")).click();
	Thread.sleep(1000);
	}
	Actions action=new Actions(driver);
//	By.id("popup_title"
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Administration']"))).build().perform();
	Thread.sleep(2000);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Document Type']"))).click().build().perform();
	Thread.sleep(2000);
	
	//Library Navigation
//	driver.findElement(By.xpath("//*[@id=\"lsdms_library\"]/a")).click();
//	Thread.sleep(2000);
//	action.moveToElement(driver.findElement(By.xpath("//a[text()='Administration']")).build().perform();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[text()='ADD']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"C559\"]/a/span/span[2]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//label[text()='Drop file here or click to upload']")).click();
//	}
//	Set<String> ids=driver.getWindowHandles();
//	String parent=driver.getWindowHandle();
//	
//	for(String s:ids) {
//		if(!(parent.equals(s))) {
//			driver.switchTo().window(s);
//			System.out.println(driver.getTitle());
//			Thread.sleep(2000);
//		}
//	}
	 robot=new Robot();
	StringSelection file=new StringSelection("C:\\EasyDocs\\EasyDocs 2022.2.0.0\\URD\\W23-24\\Sample.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
//	driver.switchTo().window(parent);
//	Thread.sleep(2000);
	
  
	

	

	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//button[text()='Upload']")).click();
	Thread.sleep(2000);
//	driver.findElement(By.id("popup_ok")).click();
//	3Thread.sleep(3000);
	
//	driver.findElement(By.id("agl-user-icn")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[text()='Sign Out']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("agl-confirm-yes")).click();

//	Thread.sleep(2000);	driver.close();
	
	
	//*[@id="lsdms_library"]/a
}
//private static boolean isElementPresent(By id) {
	// TODO Auto-generated method stub
//	 try{
//		    driver.findElement(id);
//		    return true;
//		  }catch(NoSuchElementException e){
//		    return false;
//		  }
//}
}
