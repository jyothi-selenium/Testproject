package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties pro;

	public ConfigReader() {

		try {
			File src = new File("./Configuration/Config.property");

			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	
	public String  getchromepath()
	{
		String chromepath=pro.getProperty("ChromePath");
		return chromepath;
		
		
		
	}
	
	public String  getURL()
	{
		String URL=pro.getProperty("URL2");
		return URL;
		
		
		
	}
}
