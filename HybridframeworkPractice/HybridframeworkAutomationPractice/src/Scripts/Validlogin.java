package Scripts;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Constant;
import Generic.Excel;
import Generic.Property;
//import POM.Cartpage;
import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;

public class Validlogin extends Basetest {
    @Test
	public void validlogin() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
        Loginpage l=new Loginpage(driver);
		
		String us=Excel.getdata(excelpath,"Sheet1",1,0);
		String pwd=Excel.getdata(excelpath,"Sheet1",1,1);
		
		l.signinarea();
		l.emailtextbox(us);
		l.passwordtextbox(pwd);
	    l.loginbutton();
		
		Homepage h=new Homepage(driver);
		String product=Excel.getdata(excelpath,"Sheet1",1,2);
		h.searchtextbox(product);
		h.searchbutton();
		
		Dresspage p=new Dresspage(driver);
		p.clickdress();
		
		//Cartpage c=new Cartpage(driver);
		//c.listboxitem(driver);
		//c.clickcartbutton();
		//Thread.sleep(2000);
		//c.proceedcheckout();
		//Thread.sleep(2000);
		//c.logout();
 
    	
	}
		
	
	
		

	}


