package ArisFramework1.ArisFramework1;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	  
	static WebDriver driver;
	public static final long serialVersionUID = 1L;
	public void screenshots(String image) {
	   
	    
	        try {
	            Thread.sleep(120);
	            Robot r = new Robot();
	  
	            // It saves screenshot to desired path
	            String path = "C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\Assessment1\\"+image+".jpg";
	  
	            // Used to get ScreenSize and capture image
	            Rectangle capture = 
	            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage Image = r.createScreenCapture(capture);
	            ImageIO.write(Image, "jpg", new File(path));
	            System.out.println("Screenshot saved");
	        }
	        catch (AWTException | IOException | InterruptedException ex) {
	            System.out.println(ex);
	        }
	    }
	public void takesnapshot(String vString) throws IOException
	{
	    TakesScreenshot ts = ((TakesScreenshot)driver);
	    File source= ts.getScreenshotAs(OutputType.FILE);    
	    File DestFile = new File ("C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\Day 5\\screenshot" + vString+ ".png");
	    FileUtils.copyFile(source,DestFile);
//	    vfilepath = DestFile.getPath();
//	    System.out.println("File Path :" + vfilepath);
	}
	}

