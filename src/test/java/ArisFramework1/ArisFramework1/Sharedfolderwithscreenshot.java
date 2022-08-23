package ArisFramework1.ArisFramework1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sharedfolderwithscreenshot {
static WebDriver d;
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
//		 d=new ChromeDriver();
//		d.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
//		d.manage().window().maximize();
		Robot robot = new Robot();
		StringSelection file=new StringSelection("\\\\blrshare"+"\\Shared"+"\\ALM_Addins");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_R);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_L);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		String fi="ALM_Addins";
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		StringSelection file1=new StringSelection("\\\\blrshare"+"\\Shared"+"\\"+fi+"\\Addin for excel"+"\\Business Views Microsoft Excel Add-In For ALM 16.0");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file1, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_L);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		TakesScreenshot ts = ((TakesScreenshot)d);
	    File source= ts.getScreenshotAs(OutputType.FILE);    
	    File DestFile = new File ("C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\Day 5\\screenshot"+"first.png");
	    FileUtils.copyFile(source,DestFile);
		

	}

}
