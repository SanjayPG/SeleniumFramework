package utilities;

import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class LogUtil {
	
	
		
		public static Logger logger = null;
		
		public LogUtil(String className)
		{
			String log4j = System.getProperty("user.dir")+"//log4j.properties";
			PropertyConfigurator.configure(log4j);
			logger = Logger.getLogger(className.getClass());
		}
		
		
	}
		


