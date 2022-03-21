package stepdefinitions;

import com.base.Base;
import com.pages.ManageProgramsPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsersSteps extends Base {
	
}
	ManageUsersPage manageUsrPage;
	
	      UsersSteps()  {
			super();
		}
		
	@Before
	public void setUp() {
		
		initialize(prop.getProperty("browser"));
		manageUsrPage = new ManageUsersPage();
	}
	 
	@After
	public void tearDown() {
		
		
	}

	@Given("Admin is on LMS Admin User Page")
	public void admin_is_on_lms_admin_user_page() {
	   
	}

	@When("Admin clicks on search button after entering  Email or Batch or Skill or program")
	public void admin_clicks_on_search_button_after_entering_email_or_batch_or_skill_or_program() {
	    
	}

	@Then("Admin will be navigated to Manage users\\(admin) page and Registered User list will be displayed.")
	public void admin_will_be_navigated_to_manage_users_admin_page_and_registered_user_list_will_be_displayed() {
	   
	}

	@Given("Admin is on Manage users\\(admin) page, Registered User list")
	public void admin_is_on_manage_users_admin_page_registered_user_list() {
	    
	}

	@When("Admin clicks on edit icon, admin will be navigated to Manage users\\(admin) page")
	public void admin_clicks_on_edit_icon_admin_will_be_navigated_to_manage_users_admin_page() {
	    
	}

	@Then("Admin able to edit User details like Time zone, User role batch, Program.")
	public void admin_able_to_edit_user_details_like_time_zone_user_role_batch_program() {
	    
	}

	@Given("Admin is on Manage users\\(admin) page, Registered Users list")
	public void admin_is_on_manage_users_admin_page_registered_users_list() {
	   
	}

	@When("Admin clicks on trash icon of particular registered user")
	public void admin_clicks_on_trash_icon_of_particular_registered_user() {
	    
	}

	@Then("Deleted registered user will be removed from Registered users list")
	public void deleted_registered_user_will_be_removed_from_registered_users_list() {
	   
	}

	@When("Admin clicks on eye icon for particular user")
	public void admin_clicks_on_eye_icon_for_particular_user() {
	    
	}

	@Then("Admin will be navigated to Admin Manage user page, view the User details only in read only format")
	public void admin_will_be_navigated_to_admin_manage_user_page_view_the_user_details_only_in_read_only_format() {
	   
	}

	@When("Admin clicks on New Unassigned User hyperlink")
	public void admin_clicks_on_new_unassigned_user_hyperlink() {
	   
	}

	@Then("Admin will be navigated to  Manage user\\(admin) page, Unregistered User list will be displayed")
	public void admin_will_be_navigated_to_manage_user_admin_page_unregistered_user_list_will_be_displayed() {
	   
	}

	@Given("Admin is on  Manage user\\(admin) page, Unregistered User list")
	public void admin_is_on_manage_user_admin_page_unregistered_user_list() {
	  
	}

	@When("Admin clicks on edit icon of particular unregistered user, admin will be navigated to manage users\\(admin) page")
	public void admin_clicks_on_edit_icon_of_particular_unregistered_user_admin_will_be_navigated_to_manage_users_admin_page() {
	    
	}

	@Then("Admin will be able to edit User details like Time zone, User role batch, Program.")
	public void admin_will_be_able_to_edit_user_details_like_time_zone_user_role_batch_program() {
	   
	}

	@When("Admin clicks on trash icon of particular unregistered user")
	public void admin_clicks_on_trash_icon_of_particular_unregistered_user() {
	    
	}

	@Then("Deleted unregistered user will be removed from Unregistered users list")
	public void deleted_unregistered_user_will_be_removed_from_unregistered_users_list() {
	    
	}
