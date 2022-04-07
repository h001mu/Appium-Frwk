package genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	public String getProperty(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("data\\mobileProporties.TXT");
		Properties po = new Properties();
		po.load(fis);
		String value=po.getProperty(key);
		return value;
		
	}

}
