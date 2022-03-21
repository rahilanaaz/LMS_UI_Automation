package stepdefinitions;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base;
import com.pages.LaunchWebsitePage;
import com.pages.LoginPage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSteps extends Base {
	
	LoginPage loginPage = new LoginPage();
	LaunchWebsitePage launchPage = new LaunchWebsitePage();
	String reqUrl;
	String login;
	String launchpage;
	
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
			loginPage.click();
			
		    System.out.println("LMSUI: when user clicks login HyperLink");
		}
		@Then("Admin or User is on LoginPage.")
		public void admin_or_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			//assert login page here
			launchpage =launchPage.Url();
			
			assertEquals(launchpage, prop.getProperty("loginpage"));
		    System.out.println("navaigated to LMS website");
		   
		}
			
		//@SubmitButton-PostiveScenario
		/*@Given("Admin or User is on LoginPage")
		public void admin_or_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("LMS:UI Admin or User is on login Page");
		}*/ //- use then of @loginpagevalidation as given here
		
		@When("Admin or User enters UserName, Password, clicks Login Button")
		public void admin_or_user_enters_user_name_password_clicks_login_button() {
		    // Write code here that turns the phrase above into concrete actions
			
		   System.out.println("LmsUI: admin or user enter username , password ,clicks Login Button");
		}

		@Then("Admin or User is navigated to Home Page.")
		public void admin_or_user_is_navigated_to_home_page() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI: admin or user is navigated to Home page");
		}
		
		//@SubmitButton-NegativeScenario
		
		//Given Admin or User is on Loginpage -Negative case
			/*@Given("Admin or User is on LoginPage")
			public void admin_or_user_is_on_login_page() {
				
				
			    // Write code here that turns the phrase above into concrete actions
			   System.out.println("LmsUI: admin or user is on Login page");
			}*/
		
		@When("Admin or User enters Invalid UserName, Invalid Password, clicks Login Button")
		public void admin_or_user_enters_invalid_user_name_invalid_password_clicks_login_button() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI: admin or user enters invalid username and password");
		}

		@Then("Admin or User is shown error message on same login page.")
		public void admin_or_user_is_shown_error_message_on_same_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI:invalid credentials error message is shown");
		}
		//@ForgotPasswordButtonRegisteredEmailIds-PostiveCase
		@Given("Registerd User is on LoginPage")
		public void registerd_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI: registered user is on logon page");;
		}
		@When("Admin or User enters UserName, clicks forgot password Button.")
		public void admin_or_user_enters_username_clicks_forgot_password_button() {
			// Write code here that turns the phrase above into concrete actions
			System.out.println("LMSUI: admin or user enters username and clicks forgot password button");
		}
		@And("Admin or User is on answer security question page")
		public void admin_or_user_is_on_answer_security_question_page() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI: admin or user is on answer security question page");
		}
		
		@Then("Admin or User is shown with message: <password reset link has been sent to registered email address>.")
		public void admin_or_user_is_shown_with_message_password_reset_link_has_been_sent_to_registered_email_address() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("LmsUI: admin or user is showm with message: password reset link has been shared to registered email address");
		}
		
		
		  //@ForgotPasswardButtonUnRegisteredEmailIds-NegativeCase
		@Given("UnRegisterd User is on LoginPage")
		public void un_registerd_user_is_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("LmsUI: registered user is on logon page");
		}
		
		/*@When("Admin or User enters UserName, clicks forgot password Button.")
		public void admin_or_user_enters_user_name_clicks_forgot_password_button() {
		    // Write code here that turns the phrase above into concrete actions
		   System.out.println("admin or user enters Username , clicks forgot password");
		}*/ //-Use postive case when
		
		@Then("Admin or User is shown with message: <provided email is not registered>.")
		public void admin_or_user_is_shown_with_message_provided_email_is_not_registered() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("LmsUI: admin or user is shown error mesage:<provided emai>");
		}
}
