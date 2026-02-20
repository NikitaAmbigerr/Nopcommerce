package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement registration;
		
		@FindBy(xpath="//a[normalize-space()='Log in']")
		WebElement login;
		
		public void click1() {	
			registration .click();
		}	
		
		public void click2() {
			login.click();
		}
		
	}


