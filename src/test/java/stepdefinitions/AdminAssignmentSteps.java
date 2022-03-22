
package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;
import com.pages.AdminAssignmentPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminAssignmentSteps extends Base {

	AdminAssignmentPage adminAssignPg = new AdminAssignmentPage();

	@Before
	public void setup(String browserName) {
		initialize(browserName);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("Admin is on Add tab of manage Assignments page\\(admin view) by clicking on Add Assignment in Manage Assignments Page\\(admin)")
	public void admin_is_on_add_tab_of_manage_assignments_page_admin_view_by_clicking_on_add_assignment_in_manage_assignments_page_admin() {
		adminAssignPg.manageAssignments();
		adminAssignPg.addAssignmentbt();
	}

	@When("Admin clicks on submit button after selecting Batch and enters {string}, {string} , {string}, Upload assignments")
	public void admin_clicks_on_submit_button_after_selecting_batch_and_enters_upload_assignments(String string,
			String string2, String string3) {
		// Enter the assignment field values and submit

		adminAssignPg.addAssignments(string3, string3, string, string2, string3);
	}

	@Then("Created assignments will be displayed in Manage Assignments Page\\(admin) and\\/or Manage Assignment page\\(User View)")
	public void created_assignments_will_be_displayed_in_manage_assignments_page_admin_and_or_manage_assignment_page_user_view(
			io.cucumber.datatable.DataTable dataTable) {
		adminAssignPg.assertAddAssignments();
//    			
	}

	@Given("Admin is on Edit tab of manage Assignments page\\(admin view) by clicking on Add Assignment in Manage Assignments Page\\(admin)")
	public void admin_is_on_edit_tab_of_manage_assignments_page_admin_view_by_clicking_on_add_assignment_in_manage_assignments_page_admin() {
		adminAssignPg.manageAssignments();
		adminAssignPg.editAssignmentbt();
	}

	@When("Admin clicks on submit button after updating one or more assignment details")
	public void admin_clicks_on_submit_button_after_updating_one_or_more_assignment_details() {
		adminAssignPg.editAssignments("batchId", "assignDescstr");
	}

	@Then("Updated assignment details will be displayed in Manage Assignments Page\\(admin) and or Manage Assignment page\\(User View)")
	public void updated_assignment_details_will_be_displayed_in_manage_assignments_page_admin_and_or_manage_assignment_page_user_view() {
		adminAssignPg.assertEditAssignments();
	}

	@Given("Admin is on Manage Assignments Page\\(admin)")
	public void admin_is_on_manage_assignments_page_admin() {
		adminAssignPg.manageAssignments();

	}

	@When("Admin clicks on Trash icon after selecting existing assignments")
	public void admin_clicks_on_trash_icon_after_selecting_existing_assignments() {
		adminAssignPg.deleteAssign();

	}

	@Then("Deleted assignment will be removed from Admin View in Manage Assignments Page\\(admin) and Manage Assignment page\\(User View)")
	public void deleted_assignment_will_be_removed_from_admin_view_in_manage_assignments_page_admin_and_manage_assignment_page_user_view() {
		adminAssignPg.assertDeleteAssignments();
	}

	@Given("Admin is on Manage Submissions\\(Admin) page by clicking on Manage button in Manage assignments page\\(admin), also selecting Make Grade Visible")
	public void admin_is_on_manage_submissions_admin_page_by_clicking_on_manage_button_in_manage_assignments_page_admin_also_selecting_make_grade_visible() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_like_batch_assignment_name_assignment_date_grade_by_grade_make_garde_visible_and_add_comments() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("Grade Details will be visible to both Admin and User View")
	public void grade_details_will_be_visible_to_both_admin_and_user_view() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("Admin is on Manage Submissions\\(Admin) page by clicking on Manage button in Manage assignments page\\(admin), also not selecting Make Grade Visible")
	public void admin_is_on_manage_submissions_admin_page_by_clicking_on_manage_button_in_manage_assignments_page_admin_also_not_selecting_make_grade_visible() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("Admin clicks on Submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,add comments")
	public void admin_clicks_on_submit_button_after_selecting_all_the_details_like_batch_assignment_name_assignment_date_grade_by_grade_add_comments() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("Grade Details will be visible only to Admin")
	public void grade_details_will_be_visible_only_to_admin() {
	}

}
