//$Id$
package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("/home/jaya-14813/Downloads/learning/TestAutomationFrameWork/src/test/resources/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fr);
		System.out.println((prop.getProperty("browser")));
		
	}

}
