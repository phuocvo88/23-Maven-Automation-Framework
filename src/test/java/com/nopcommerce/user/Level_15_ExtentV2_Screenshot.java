package com.nopcommerce.user;

import java.lang.reflect.Method;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;





public class Level_15_ExtentV2_Screenshot extends BaseTest{
	 WebDriver driver;
	 String projectPath = System.getProperty("user.dir");
	 String firstName, lastName, invalidEmail, notFoundEmail, emailAddress, validPassword;

	 UserHomePageObject homePage;
	 UserRegisterPageObject registerPage;
	 UserLoginPageObject loginPage;
	 UserCustomerInforPageObject customerInforPage;



	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {

		driver = getBrowserDriver(browserName);
//		homePage = new HomePageObject(driver);
		homePage = PageGeneratorManager.getUserHomePage(driver);

		firstName = "Automation";
		lastName = "FC";
		validPassword = "123456";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn"; // web mail server
	
	}

	@Test
	public void User_01_Register(Method method) {
//		ExtentTestManager.startTest(method.getName(), "User_01_Register");
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 01: Navigate to 'Register' page");
//		registerPage = homePage.openRegisterPage();
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 02: Enter to Firstname textbox with value is '"+ firstName +"' ");
//		registerPage.inputToFirstnameTextbox(firstName);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 03: Enter to Lastname textbox with value is '"+ lastName +"' ");
//		registerPage.inputToLastnameTextbox(lastName);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 04: Enter to Email textbox with value is '"+ emailAddress +"' ");
//		registerPage.inputToEmailTextbox(emailAddress);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 05: Enter to Password textbox with value is '"+ validPassword +"' ");
//		registerPage.inputToPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 06: Enter to Confirm  Passwordtextbox with value is '"+ validPassword +"' ");
//		registerPage.inputToConfirmPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 07: Click to 'Register' button");
//		registerPage.clickToRegisterButton();
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Register - Step 08:  Verify register success message is displayed");
//		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed...");
//			
//		ExtentTestManager.endTest();
	}

	@Test
	public void User_02_Login(Method method) {
//		ExtentTestManager.startTest(method.getName(), "User_02_Login");
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 01:  Navigate to Login page");
//		homePage = registerPage.clickToLogoutLink();
//	
//		loginPage = homePage.openLoginPage();
//	 
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 02: Enter to Email textbox with value is '"+ emailAddress +"' ");
//		loginPage.inputToEmailTextbox(emailAddress);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 03: Enter to Email textbox with value is '"+ validPassword +"' ");
//		loginPage.inputToPasswordTextbox(validPassword);
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 04: Click to Login button");
//		homePage = loginPage.clickToLoginButton();
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 05: Verify 'My Account' link is displayed");
//		Assert.assertFalse(homePage.isMyAccountLinkDisplayed());
//
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 06: Navigate to 'My Account' page");
//		customerInforPage = homePage.openMyAccountPage();
//		
//		ExtentTestManager.getTest().log(LogStatus.INFO, "Login - Step 07: Verify 'Customer Infor' page is displayed");
//		Assert.assertFalse(customerInforPage.isCustomerInforPageDisplayed());
//		
//		ExtentTestManager.endTest();
	}
	
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int generateFakeNumber() {
		Random rand = new Random();

		return rand.nextInt(9999);
	}

}
