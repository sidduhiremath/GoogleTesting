package ArisFramework1.ArisFramework1;




import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReporterNG implements IReporter{
	public ExtentReports extent;
	ExtentHtmlReporter htmlreport;
	
	public void generatereport(List<XmlSuite> XmlSuite,List<ISuite> suites,String OutputDirectory) {
		htmlreport= new ExtentHtmlReporter(System.getProperty("user.dir")+"C:\\Users\\00005110\\eclipse-workspace\\ArisFramework1\\Reports\\htmlreport.html");
		extent=new ExtentReports();
		for(ISuite suite:suites) {
			Map<String, ISuiteResult> result=suite.getResults();
			for(ISuiteResult r: result.values()) {
				ITestContext context=r.getTestContext();
				buildTestNodes(context.getPassedTests(), Status.PASS);
				buildTestNodes(context.getPassedTests(), Status.FAIL);
				buildTestNodes(context.getPassedTests(), Status.SKIP);

			}
		}
		extent.flush();
	}

	private void buildTestNodes(IResultMap tests, Status status) {
		ExtentTest test;
		
		if(tests.size()>0) {
			for(ITestResult result:tests.getAllResults()){
				test=extent.createTest(result.getMethod().getMethodName());
				
				for(String group:result.getMethod().getGroups())
					test.assignCategory(group);
				String message="Test"+status.toString().toLowerCase()+"ed";
				
				
				if(result.getThrowable()!=null) {
					
					message=result.getThrowable().getMessage();
					test.log(status,message);
					
				}
			}
		}
	}
		
		
//		private Date getTime(long milles) {
//			Calendar c= Calendar.getInstance();
//			c.setTimeInMillis(milles);
//			return c.getTime();
//			
//		}
		
	}


