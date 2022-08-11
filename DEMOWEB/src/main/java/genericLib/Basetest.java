package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basetest {

	public static WebDriver driver;
	  @BeforeClass
	  public void before() throws IOException
	 {
		  System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		   driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     
	  }
	 @AfterClass
	 public void after()
	 {
		 driver.close();
	 }
}
