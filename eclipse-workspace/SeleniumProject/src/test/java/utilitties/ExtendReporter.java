package utilitties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporter {
	public static final ExtentReports extent = new ExtentReports();

//	static ExtentReports extent;
	public static ExtentReports extendReportGenerator() {

		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/extent-report.html");
		reporter.config().setReportName("eFinancialCareers website Automation Results");
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Anusree");
		return extent;
	}
}
