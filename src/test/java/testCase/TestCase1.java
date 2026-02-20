package testCase;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseTest;

public class TestCase1 extends BaseTest {

@Test
public void Goto_Registartion_page() {
	HomePage hp= new HomePage(driver);
	hp.click1();
	RegistrationPage RP= new RegistrationPage(driver);
	RP.clickfemalebutton();
	RP.enterfname("xyz");
	RP.enterLname("ABC");
	RP.enteremail("xyzabc@gmail.com");
	RP.entercompany("XXYYZZ");
	RP.enterpass("Xyz@ABC");
	RP.entercpass("Xyz@ABC");
	RP.clickRegister();
}
}
