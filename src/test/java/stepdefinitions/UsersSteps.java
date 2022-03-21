package stepdefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.base.Base;
import com.pages.UploadPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsersSteps extends Base {
	
	UsersPage Users = new UsersPage();
	
	
UploadPage UP;
	
	UploadStep(){
				super();
		}
	
	@Before
	public void beforeScenario() {
		 Base.initialize(prop.getProperty("browser"));
		 UP = new UploadPage();
		 //here need to give login details and homepage details 
		 
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("Admin is on LMS Admin User Page")
	public void admin_is_on_lms_admin_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on search button after entering  Email or Batch or Skill or program")
	public void admin_clicks_on_search_button_after_entering_email_or_batch_or_skill_or_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin will be navigated to Manage users\\(admin) page and Registered User list will be displayed.")
	public void admin_will_be_navigated_to_manage_users_admin_page_and_registered_user_list_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Manage users\\(admin) page, Registered User list")
	public void admin_is_on_manage_users_admin_page_registered_user_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on edit icon, admin will be navigated to Manage users\\(admin) page")
	public void admin_clicks_on_edit_icon_admin_will_be_navigated_to_manage_users_admin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin able to edit User details like Time zone, User role batch, Program.")
	public void admin_able_to_edit_user_details_like_time_zone_user_role_batch_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on Manage users\\(admin) page, Registered Users list")
	public void admin_is_on_manage_users_admin_page_registered_users_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on trash icon of particular registered user")
	public void admin_clicks_on_trash_icon_of_particular_registered_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Deleted registered user will be removed from Registered users list")
	public void deleted_registered_user_will_be_removed_from_registered_users_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on eye icon for particular user")
	public void admin_clicks_on_eye_icon_for_particular_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin will be navigated to Admin Manage user page, view the User details only in read only format")
	public void admin_will_be_navigated_to_admin_manage_user_page_view_the_user_details_only_in_read_only_format() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on New Unassigned User hyperlink")
	public void admin_clicks_on_new_unassigned_user_hyperlink() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin will be navigated to  Manage user\\(admin) page, Unregistered User list will be displayed")
	public void admin_will_be_navigated_to_manage_user_admin_page_unregistered_user_list_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on  Manage user\\(admin) page, Unregistered User list")
	public void admin_is_on_manage_user_admin_page_unregistered_user_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on edit icon of particular unregistered user, admin will be navigated to manage users\\(admin) page")
	public void admin_clicks_on_edit_icon_of_particular_unregistered_user_admin_will_be_navigated_to_manage_users_admin_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin will be able to edit User details like Time zone, User role batch, Program.")
	public void admin_will_be_able_to_edit_user_details_like_time_zone_user_role_batch_program() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on trash icon of particular unregistered user")
	public void admin_clicks_on_trash_icon_of_particular_unregistered_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Deleted unregistered user will be removed from Unregistered users list")
	public void deleted_unregistered_user_will_be_removed_from_unregistered_users_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
