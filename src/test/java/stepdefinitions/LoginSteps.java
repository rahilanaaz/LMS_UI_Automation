package stepdefinitions;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pages.HomePage;
import com.pages.LaunchWebsitePage;
import com.pages.LoginPage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSteps extends Base {
	
	LoginPage loginPage = new LoginPage();
	LaunchWebsitePage launchPage = new LaunchWebsitePage();
	HomePage homePageObject = new HomePage();
	//String reqUrl;
	String login;
	String launchpage;
	String homePage;
	@Before
	public void setup(String browserName) {
		WebDriver driver=initialize(browserName);
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
		//@LoginPageValidation
		@Given("Admin or User is on LMS website page")
		public void admin_or_user_is_on_LMS_web_page() {
		    // Write code here that turns the phrase above into concrete actions
					
		    System.out.println("LMS:UI LMS website is viewed");
		}
		
		@When("Admin or User clicks Login Hyperlink")
		public void admin_or_user_clicks_login_hyperlink() {
		    // Write code here that turns the phrase above into concrete actions
			loginPage.loginClick();
			
		    System.out.println("LMSUI: when user clicks login HyperLink");
		}
		@Then("Admin or User is on LoginPage.")
		public void admin_or_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			//assert login page here
			login =loginPage.getpresentUrl();
			
			assertEquals(login, prop.getProperty("loginpage"));
			
		    System.out.println("navaigated to LMS website");
		   
		}
			
		//@SubmitButton-PostiveScenario -use then of @loginpagevalidation as given here
		/*@Given("Admin or User is on LoginPage")
		public void admin_or_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("LMS:UI Admin or User is on login Page");
		}*/ 
		
		@When("Admin or User enters (.*), (.*), clicks Login Button")
		public void admin_or_user_enters_user_name_password_clicks_login_button(String UserName, String Password) {
		    // Write code here that turns the phrase above into concrete actions
			 homePageObject = loginPage.signInPage(UserName, Password);
			
		   System.out.println("LmsUI: admin or user enter username , password ,clicks Login Button");
		}

		@Then("Admin or User is navigated to Home Page.")
		public void admin_or_user_is_navigated_to_home_page() {
		    // Write code here that turns the phrase above into concrete actions
			assertEquals(true,loginPage.isLogoutDisplayed()); 
			
			assertEquals(loginPage.getpresentUrl(), prop.getProperty("homepage"));
			
		   System.out.println("LmsUI: admin or user is navigated to Home page");
		}
		
		//@SubmitButton-NegativeScenario
		
		//Given Admin or User is on Loginpage -Negative case
			/*@Given("Admin or User is on LoginPage")
			public void admin_or_user_is_on_login_page() {
				
				
			    // Write code here that turns the phrase above into concrete actions
			   System.out.println("LmsUI: admin or user is on Login page");
			}*/
		
		@When("Admin or User enters (.*), (.*), clicks Login Button")
		public void admin_or_user_enters_invalid_user_name_invalid_password_clicks_login_button(String InvalidUserName ,String InvalidPassword) {
		    // Write code here that turns the phrase above into concrete actions
			loginPage.signInPage(InvalidUserName, InvalidPassword);
			
		   System.out.println("LmsUI: admin or user enters invalid username and password");
		}

		@Then("Admin or User is shown error message on same login page.")
		public void admin_or_user_is_shown_error_message_on_same_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			
			assertEquals(false,loginPage.isLogoutDisplayed()); 
			
			assertNotEquals(loginPage.getpresentUrl(), prop.getProperty("homepage"), "both are not equal");
			
			assertNotNull(loginPage.getInvalidCredentialErrorMessage());
			
			System.out.println("LmsUI:invalid credentials error message is shown");
		}
		
		//@ForgotPasswordButtonRegisteredEmailIds-PostiveCase
		@Given("Registerd User after clciking forgot password button, is on Answer Security Page")
		public void registerd_user_after_clciking_forgot_password_button_is_on_answer_security_page() {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@When("Registerd User enters (.*), clicks next button.")
		public void registerd_user_enters_UserName_clicks_next_button(String UserName) {
		    // Write code here that turns the phrase above into concrete actions
			
		    
		}

		@And("Registerd User enters answer for Security Question.")
		public void registerd_user_enters_answer_for_security_question() {
		    // Write code here that turns the phrase above into concrete actions
			
		    
		}

		@Then("Registerd User is shown with message: <Password Reset Link has been sent to Email Address>.")
		public void registerd_user_is_shown_with_message_password_reset_link_has_been_sent_to_email_address() {
		    // Write code here that turns the phrase above into concrete actions
			
		    
		}

		
		  //@ForgotPasswardButtonUnRegisteredEmailIds-NegativeCase
		@Given("UnRegisterd User after clciking forgot password button, is on Answer Security Page")
		public void un_registerd_user_after_clciking_forgot_password_button_is_on_answer_security_page() {
		    // Write code here that turns the phrase above into concrete actions
			
		    
		}

		/*@When("UnRegisterd User enters UserName, clicks next Button.")
		public void un_registered_user_enters_user_name_clicks_next_button() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("admin or user enters Username , clicks forgot password");
		}*/ //-Use postive case when
		
		@Then("UnRegisterd User is shown with message: <Provided Email Id is not registered>.")
		public void un_registered_user_is_shown_with_message_provided_email_id_is_not_registered() {
		    // Write code here that turns the phrase above into concrete actions
		   
			
		}
	}
