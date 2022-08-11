package Testcase;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class TC_airtel_002_Test extends Basetest {
	 @Test(groups = "SMOKE")
	   public void demo() 
		    {
			      driver.get("https://www.airtel.com/");
		     }

}
