package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseTest;

public class TestCase1 extends BaseTest {

@Test
public void Goto_Registartion_page() {
	HomePage hp= new HomePage(driver);
	hp.click();
}
}
