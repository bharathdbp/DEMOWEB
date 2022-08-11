package Testcase;

import org.testng.annotations.Test;

import genericLib.Basetest;

public class TC_Pepsi_Test extends Basetest {
	 @Test(groups = "SMOKE")
		public void main() 
		  {
			      driver.get("https://www.pepsi.com/");       
		  }
}
