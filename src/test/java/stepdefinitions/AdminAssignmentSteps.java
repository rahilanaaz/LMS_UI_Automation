<<<<<<< HEAD
package stepdefinitions;

import com.base.Base;
import com.pages.AdminAssignmentPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAssignmentSteps extends Base{
	
	AdminAssignmentPage AdminAssignPg= new AdminAssignmentPage();
	
	@Before
	public void setup(String browserName) {
		initialize(browserName);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Given("Admin is on Add tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)")
	public void admin_is_on_add_tab_of_manage_assignments_page_by_clicking_on_add_assignment() {
		//AdminAssignmentPage.goToAdminAssignPg();
	}
	
   @When("When Admin clicks on submit button after selecting Batch and enters Assignment name, Assignment Description , Assignment Due, Upload assignments")
	public void admin_clicks_on_submit_button_enters_assignment_details() {
		//Assignment details inside the method
	}
   @Then("Created assignments will be displayed in Manage Assignments Page(admin) and/or Manage Assignment page(User View)")
	public void created_assignments_will_be_displayed_in_manage_assignments_page() {
		//Assignment details inside the method
	}
	
   @Given("Admin is on Edit tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)")
	public void admin_is_on_edit_tab_of_manage_assignments_page_by_clicking_on_add_assignment() {
		//AdminAssignmentPage.goToAdminAssignPg();
	}
 

   @When("Admin clicks on submit button after updating one or more assignment details")
	public void admin_clicks_on_submit_button_after_updating_one_or_more_assignment_details() {
		//Assignment details inside the method
	}
   
   @Then("Updated assignment details will be displayed in Manage Assignments Page(admin) and or Manage Assignment page(User View)")
	public void updated_assignments_will_be_displayed_in_manage_assignments_page() {
		//Assignment details inside the method
   }
	
   @Given("Admin is on Manage Assignments Page(admin)")
	public void admin_is_on_manage_assignments_page() {
		//method();
	}
 
   @When("When Admin clicks on Trash icon after selecting existing assignments")
	public void admin_clicks_on_trash_icon_after_selecting_existing_assignments() {
		//Assignment details inside the method
	}
   
   @Then("Deleted assignment will be removed from Admin View in Manage Assignments Page(admin) and Manage Assignment page(User View)")
  	public void deleted_assignment_will_be_removed_from_admin_view_in_manage_assignments_page() {
  		//Assignment details inside the method
     }
  	
  
   @Given("Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)")
	public void admin_is_on_manage_submissions_page_by_clicking_on_manage_button_in_manage_assignments_page() {
		//method();
	}

  @When("Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_and_selecting_make_grade_visible() {
		//Assignment details inside the method
	}
  
  @Then("Grade Details will be visible to both Admin and User View")
 	public void grade_details_will_be_visible_to_both_admin_and_user_view() {
 		//Assignment details inside the method
    }


 @When("Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_and_not_selecting_make_grade_visible() {
		//Assignment details inside the method
	}
 
 @Then("Grade Details will be visible only to Admin")
	public void grade_details_will_be_visible_only_to_admin() {
		//Assignment details inside the method
   }
  
      
   
  




}
	
=======
package stepdefinitions;

import com.base.Base;
import com.pages.AdminAssignmentPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAssignmentSteps extends Base{
	
	AdminAssignmentPage AdminAssignPg= new AdminAssignmentPage();
	
	@Before
	public void setup(String browserName) {
		initialize(browserName);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Given("Admin is on Add tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)")
	public void admin_is_on_add_tab_of_manage_assignments_page_by_clicking_on_add_assignment() {
		//AdminAssignmentPage.goToAdminAssignPg();
	}
	
   @When("When Admin clicks on submit button after selecting Batch and enters Assignment name, Assignment Description , Assignment Due, Upload assignments")
	public void admin_clicks_on_submit_button_enters_assignment_details() {
		//Assignment details inside the method
	}
   @Then("Created assignments will be displayed in Manage Assignments Page(admin) and/or Manage Assignment page(User View)")
	public void created_assignments_will_be_displayed_in_manage_assignments_page() {
		//Assignment details inside the method
	}
	
   @Given("Admin is on Edit tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)")
	public void admin_is_on_edit_tab_of_manage_assignments_page_by_clicking_on_add_assignment() {
		//AdminAssignmentPage.goToAdminAssignPg();
	}
 

   @When("Admin clicks on submit button after updating one or more assignment details")
	public void admin_clicks_on_submit_button_after_updating_one_or_more_assignment_details() {
		//Assignment details inside the method
	}
   
   @Then("Updated assignment details will be displayed in Manage Assignments Page(admin) and or Manage Assignment page(User View)")
	public void updated_assignments_will_be_displayed_in_manage_assignments_page() {
		//Assignment details inside the method
   }
	
   @Given("Admin is on Manage Assignments Page(admin)")
	public void admin_is_on_manage_assignments_page() {
		//method();
	}
 
   @When("When Admin clicks on Trash icon after selecting existing assignments")
	public void admin_clicks_on_trash_icon_after_selecting_existing_assignments() {
		//Assignment details inside the method
	}
   
   @Then("Deleted assignment will be removed from Admin View in Manage Assignments Page(admin) and Manage Assignment page(User View)")
  	public void deleted_assignment_will_be_removed_from_admin_view_in_manage_assignments_page() {
  		//Assignment details inside the method
     }
  	
  
   @Given("Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)")
	public void admin_is_on_manage_submissions_page_by_clicking_on_manage_button_in_manage_assignments_page() {
		//method();
	}

  @When("Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_and_selecting_make_grade_visible() {
		//Assignment details inside the method
	}
  
  @Then("Grade Details will be visible to both Admin and User View")
 	public void grade_details_will_be_visible_to_both_admin_and_user_view() {
 		//Assignment details inside the method
    }


 @When("Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_and_not_selecting_make_grade_visible() {
		//Assignment details inside the method
	}
 
 @Then("Grade Details will be visible only to Admin")
	public void grade_details_will_be_visible_only_to_admin() {
		//Assignment details inside the method
   }
  
      
   
  




}
	
>>>>>>> Branch_Sumathi
  