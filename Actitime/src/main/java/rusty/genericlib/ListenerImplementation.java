package rusty.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements  ITestListener   {
	
	public void onTestFailure(ITestResult result)
	{
		String tname=result.getTestName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.ListenerDriver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./tapu/"+tname+".png");
		try {
			FileUtils.copyFile(src, f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
