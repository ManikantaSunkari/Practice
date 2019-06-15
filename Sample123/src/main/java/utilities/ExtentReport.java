package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public void myReport() {
		
	ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/newreport.html");
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(report);
	ExtentTest logger = extent.createTest("Login Test");
	logger.log(Status.PASS, "Logn Test");
	extent.flush();
	
	}	
}
