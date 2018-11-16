package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
       //Declaration
	   @FindBy(id="search_query_top")
	   private WebElement searchtxtbox;
	   
	   @FindBy(name="submit_search")
	   private WebElement searchbtn;
	   
	   @FindBy(xpath="//span[.='My wishlists']")
	   private WebElement wishlistbtn;
	   
	   //initialize
	   public Homepage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //utilize
	   public void searchtextbox(String product)
	   {
		   searchtxtbox.sendKeys(product);
	   }
	   
	   public void searchbutton()
	   {
		   searchbtn.click();
	   }
	   public void wishlistbutton()
	   {
		   wishlistbtn.click();
	   }
}

