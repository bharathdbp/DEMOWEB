package maven_paramaters;

import org.junit.Test;

public class To_read_the_data_from_maver {

	@Test
	public void readdata()
	{
		String Urldata = System.getProperty("url ");
		String Urldata1 = System.getProperty("browser name");
		
		System.out.println(Urldata);
		System.out.println(Urldata1);
		
	}
}
