package S3Aws.S3Aws;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RWD {
	
	public static WebDriver driver;
	@Test
	public void testingRemote() throws IOException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		//driver = new RemoteWebDriver(dc);
		dc.setBrowserName("chrome");
		//dc.chrome().
		driver = new RemoteWebDriver(new URL("http://3.16.255.91:4455/wd/hub"),dc);
		driver.get("https://www.google.com");
		RWD.takesnap();
	}
	
	public static void takesnap() throws IOException
	{
		TakesScreenshot obj = (TakesScreenshot)driver;
		File src = obj.getScreenshotAs(OutputType.FILE);
		String des="C:\\Users\\91984\\Desktop\\Devops\\AWSScreenshot.png";
		File trg = new File(des);
		FileUtils.copyFile(src, trg);
	}

}
