package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
         public static String getPropertydata(String filepath,String key)
         {
        	 String k="";
        	 try {
        		 Properties p=new Properties();
            	 p.load(new FileInputStream(filepath)); 
            	 k=p.getProperty(key);
        	 }
        	 catch(Exception e)
        	 {
        		 
        	 }
        	 return k;
         }
}
