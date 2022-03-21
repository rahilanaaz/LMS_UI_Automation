<<<<<<< HEAD
package stepdefinitions;
import com.base.Base;
import com.pages.ManageBatchesPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageBatchesSteps extends Base {
	
	ManageBatchesPage manageBatchesPage;
	
	ManageBatchesSteps(){
		
		super();
	}
	
	@Before
	public void setUp() {
		
		initialize(prop.getProperty("browser"));
		manageBatchesPage = new ManageBatchesPage();
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	@Given("Admin is on Manage Batches Page\\(admin) screen, by clicking on batches tab")
	public void admin_is_on_manage_batches_page_admin_screen_by_clicking_on_batches_tab() {
	   
		
	}

	@When("Admin tries to view exisiting Batch details")
	public void admin_tries_to_view_exisiting_batch_details() {
	   
		
	}

	@Then("All the existing Batch details details will be displayed in Manage Batches Page\\(Admin)")
	public void all_the_existing_batch_details_details_will_be_displayed_in_manage_batches_page_admin() {
	    
		
	}

	@Given("Admin is on Add tab of ADD\\/Edit batches page \\(admin) by clicking on Add Batch in Manage Batches Page\\(admin)")
	public void admin_is_on_add_tab_of_add_edit_batches_page_admin_by_clicking_on_add_batch_in_manage_batches_page_admin() {
	    
		manageBatchesPage.clickOnAddBatchBtn();
	}

	@When("Admin clicks on submit button after entering \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void admin_clicks_on_submit_button_after_entering_batch_name_batch_description_select_batch_status_enters_batch_no_of_classes(String batchName, String batchDesc, String batchNoOfClasses, String status) {
	   
		manageBatchesPage.addBatch(batchName, batchDesc, batchNoOfClasses, status);
	}

	@Then("Created Batch details will be displayed in Manage Batches Page\\(Admin) with auto generated Created Date and Modified date in MM\\/DD\\/YY format")
	public void created_batch_details_will_be_displayed_in_manage_batches_page_admin_with_auto_generated_created_date_and_modified_date_in_mm_dd_yy_format() {
	   
		
	}

	@Given("Admin is on Edit tab of ADD\\/Edit batches page \\(admin) by clicking on edit icon")
	public void admin_is_on_edit_tab_of_add_edit_batches_page_admin_by_clicking_on_edit_icon() {
	   
		manageBatchesPage.clickOnEditBatchIconBtn();
	}

	@When("Admin clicks on submit button after updating details like \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void admin_clicks_on_submit_button_after_updating_batch_name_batch_description_select_batch_status_baych_no_of_classes(String batchName, String batchDesc, String batchNoOfClasses) {
	   
		manageBatchesPage.editBatch(batchName, batchDesc, batchNoOfClasses);
	}

	@Then("Updated Batch details will be displayed in Manage Batches Page\\(Admin) screen with same autogenerated creation date and  different Modified date in MM\\/DD\\/YY format")
	public void updated_batch_details_will_be_displayed_in_manage_batches_page_admin_screen_with_same_autogenerated_creation_date_and_different_modified_date_in_mm_dd_yy_format() {
	   
		
	}

	@Given("Admin is on Manage Batches Page\\(admin) screen")
	public void admin_is_on_manage_batches_page_admin_screen() {
	   
		
	}

	@When("Admin clicks on particular batch trash icon")
	public void admin_clicks_on_particular_batch_trash_icon() {
	   
		manageBatchesPage.deleteBatch();
	}

	@Then("Batch will be deleted from the Batches List in Manage Batches Page\\(admin)")
	public void batch_will_be_deleted_from_the_batches_list_in_manage_batches_page_admin() {
	    
		
	}

}
=======
package stepdefinitions;
import com.base.Base;
import com.pages.ManageBatchesPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageBatchesSteps extends Base {
	
	ManageBatchesPage manageBatchesPage;
	
	ManageBatchesSteps(){
		
		super();
	}
	
	@Before
	public void setUp() {
		
		initialize(prop.getProperty("browser"));
		manageBatchesPage = new ManageBatchesPage();
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	@Given("Admin is on Manage Batches Page\\(admin) screen, by clicking on batches tab")
	public void admin_is_on_manage_batches_page_admin_screen_by_clicking_on_batches_tab() {
	   
		
	}

	@When("Admin tries to view exisiting Batch details")
	public void admin_tries_to_view_exisiting_batch_details() {
	   
		
	}

	@Then("All the existing Batch details details will be displayed in Manage Batches Page\\(Admin)")
	public void all_the_existing_batch_details_details_will_be_displayed_in_manage_batches_page_admin() {
	    
		
	}

	@Given("Admin is on Add tab of ADD\\/Edit batches page \\(admin) by clicking on Add Batch in Manage Batches Page\\(admin)")
	public void admin_is_on_add_tab_of_add_edit_batches_page_admin_by_clicking_on_add_batch_in_manage_batches_page_admin() {
	    
		manageBatchesPage.clickOnAddBatchBtn();
	}

	@When("Admin clicks on submit button after entering \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void admin_clicks_on_submit_button_after_entering_batch_name_batch_description_select_batch_status_enters_batch_no_of_classes(String batchName, String batchDesc, String batchNoOfClasses, String status) {
	   
		manageBatchesPage.addBatch(batchName, batchDesc, batchNoOfClasses, status);
	}

	@Then("Created Batch details will be displayed in Manage Batches Page\\(Admin) with auto generated Created Date and Modified date in MM\\/DD\\/YY format")
	public void created_batch_details_will_be_displayed_in_manage_batches_page_admin_with_auto_generated_created_date_and_modified_date_in_mm_dd_yy_format() {
	   
		
	}

	@Given("Admin is on Edit tab of ADD\\/Edit batches page \\(admin) by clicking on edit icon")
	public void admin_is_on_edit_tab_of_add_edit_batches_page_admin_by_clicking_on_edit_icon() {
	   
		manageBatchesPage.clickOnEditBatchIconBtn();
	}

	@When("Admin clicks on submit button after updating details like \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void admin_clicks_on_submit_button_after_updating_batch_name_batch_description_select_batch_status_baych_no_of_classes(String batchName, String batchDesc, String batchNoOfClasses) {
	   
		manageBatchesPage.editBatch(batchName, batchDesc, batchNoOfClasses);
	}

	@Then("Updated Batch details will be displayed in Manage Batches Page\\(Admin) screen with same autogenerated creation date and  different Modified date in MM\\/DD\\/YY format")
	public void updated_batch_details_will_be_displayed_in_manage_batches_page_admin_screen_with_same_autogenerated_creation_date_and_different_modified_date_in_mm_dd_yy_format() {
	   
		
	}

	@Given("Admin is on Manage Batches Page\\(admin) screen")
	public void admin_is_on_manage_batches_page_admin_screen() {
	   
		
	}

	@When("Admin clicks on particular batch trash icon")
	public void admin_clicks_on_particular_batch_trash_icon() {
	   
		manageBatchesPage.deleteBatch();
	}

	@Then("Batch will be deleted from the Batches List in Manage Batches Page\\(admin)")
	public void batch_will_be_deleted_from_the_batches_list_in_manage_batches_page_admin() {
	    
		
	}

}
>>>>>>> Branch_Sumathi
