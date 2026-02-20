package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Basepage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='gender-female']")
	WebElement female;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement male;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='Company']")
	WebElement companyname;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password ;
	
	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement cpassword ;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement register;
	
	public void clickfemalebutton() {
		female.click();	
	}
	
	public void clickmalebutton() {
			male.click();
		}
	
	public void enterfname(String name) {
		Fname.sendKeys(name);
	}
	
	public void enterLname(String lname) {
		Lname.sendKeys(lname);
	}
	
	public void enteremail(String Email) {
		email.sendKeys(Email);
	}
	
	public void entercompany(String cname) {
		companyname.sendKeys(cname);
	}
	
	public void enterpass(String pass) {
		password.sendKeys(pass);
	}
	
	public void entercpass(String cpass) {
		cpassword.sendKeys(cpass);
	}
	
	public void clickRegister() {
		register.click();
	}
}
