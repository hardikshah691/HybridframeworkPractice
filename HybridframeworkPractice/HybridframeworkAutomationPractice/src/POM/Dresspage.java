package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresspage {
     //Declaration
	 @FindBy(xpath="(//img[@title='Printed Summer Dress'])[2]")
	 private WebElement selectdress;
	 
	 //initialize
	 public Dresspage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //utilize
	 public void clickdress()
	 {
		 selectdress.click();
	 }
}