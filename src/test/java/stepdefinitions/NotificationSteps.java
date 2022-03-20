package stepdefinitions;

import org.testng.Assert;
import com.base.Base;
import com.pages.NotificationPage;
import com.util.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class NotificationSteps extends Base {
	
	@Before
	public void setUp(String browserName)
	{
		initialize(browserName);
		//****Code for signin
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	NotificationPage notificationPg = new NotificationPage();
	
	@Given("Admin is on  Notification page")
	public void admin_is_on_notification_page() 
	{
		notificationPg.goToNotificationPg();
	}

	@When("Admin clicks on submit button after selectingProgram Name from dropdown and enter details  Hackathon Name,hackathon description,Hackathon date and Hackathon comments")
	public void admin_clicks_on_submit_button_after_selecting_program_name_from_dropdown_and_enter_details_hackathon_name_hackathon_description_hackathon_date_and_hackathon_comments(
	String program_name, String hackathon_name,String hackathon_description, String Hackathon_date,String hackathon_comments) 
	{
		notificationPg.sendProgramName(program_name);
		notificationPg.sendHackathonName(hackathon_name);
		notificationPg.sendHackathonDesc(hackathon_description);
		notificationPg.sendHackathonDate(Hackathon_date);
		notificationPg.sendHackathonComments(hackathon_comments);
		notificationPg.clickSubmit();
	}

	@Then("Notifications will be submitted successfully")
	public void notifications_will_be_submitted_successfully() {
	    Assert.assertEquals(notificationPg.getNotification(),Constants.getNotificationSuccessMsg());
	}

}
