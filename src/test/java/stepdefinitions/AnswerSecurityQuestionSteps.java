package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pages.AnswerSecurityQuestionPage;
import com.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnswerSecurityQuestionSteps extends Base {

	AnswerSecurityQuestionPage answerPage = new AnswerSecurityQuestionPage();
	LoginPage loginPage = new LoginPage();
	
	String answerPageUrlAsString;
	String securityQue;
	String answerToQue;
	@Before
	public void setup(String browserName) {
		WebDriver driver=initialize(browserName);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Given("Registerd User after clicking forgot password button, is on Answer Security Page")
	public void registerd_user_after_clicking_forgot_password_button_is_on_answer_security_page() {
	    // Write code here that turns the phrase above into concrete actions
		answerPage =loginPage.forgotPasswordClick();
		
		answerPageUrlAsString = answerPage.getPresentUrl();
		
		assertEquals(answerPageUrlAsString, prop.getProperty("ansSecurityPage"));
		
		System.out.println("LMS-UI: Registered user is in Answer Security Page");
	}

	@When("Registerd User enters (.*), clicks next button.")
	public void registerd_user_enters_UserName_clicks_next_button(String UserName) {
	    // Write code here that turns the phrase above into concrete actions
		 securityQue =answerPage.securityPage(UserName);
		
		System.out.println("LMS_UI: registerd user enters username and clicks next button");
	}

	@And("Registerd User enters answer for Security Question.")
	public void registerd_user_enters_answer_for_security_question() {
	    // Write code here that turns the phrase above into concrete actions
		   answerToQue= answerPage.responseToAnswer();
		System.out.println("LMS-UI: registered user answers Security question");
	}

	@Then("Registerd User is shown with message: <Password Reset Link has been sent to Email Address>.")
	public void registerd_user_is_shown_with_message_password_reset_link_has_been_sent_to_email_address() {
	    // Write code here that turns the phrase above into concrete actions
	   
		assertEquals(true,answerPage.getResetLinkeSentMessage()); 
		System.out.println("LMS-UI: registerd user is shown with message");
	}

	/*@When("Registerd User enters user2, clicks next button.")
	public void registerd_user_enters_user2_clicks_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@Given("UnRegisterd User after clicking forgot password button, is on Answer Security Page")
	public void un_registerd_user_after_clicking_forgot_password_button_is_on_answer_security_page() {
	    // Write code here that turns the phrase above into concrete actions
        answerPage =loginPage.forgotPasswordClick();
		
		answerPageUrlAsString = answerPage.getPresentUrl();
		
		assertEquals(answerPageUrlAsString, prop.getProperty("ansSecurityPage"));
		
		System.out.println("LMSUI: Unregistered user is on answer security page");
	}

	@When("UnRegistered user enters (.*), clicks next button.")
	public void un_registered_user_enters_UserName_clicks_next_button(String UserName) {
	    // Write code here that turns the phrase above into concrete actions
		securityQue =answerPage.securityPage(UserName);
		System.out.println("LMSUI: unregistered user enters username , clicks next button");
	}

	@And("UnRegistered user enters answer for Security Question.")
	public void un_registered_user_enters_answer_for_security_question() {
	    // Write code here that turns the phrase above into concrete actions
		answerToQue= answerPage.responseToAnswer();
		System.out.println("LMSUI: unregistered user answers security question ");
	}

	@Then("UnRegistered is shown with message: <Provided Email Id is not registered>.")
	public void un_registered_is_shown_with_message_provided_email_id_is_not_registered() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(true,answerPage.getUnRegResetLinkeSentMessage());
		System.out.println("LMSUI: unregistered user showm with message:Provided Email Id is not registered ");
	}

	/*@When("UnRegistered user enters user2, clicks next button.")
	public void un_registered_user_enters_user2_clicks_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/
}
