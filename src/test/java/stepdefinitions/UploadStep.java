package stepdefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.base.Base;
import com.pages.UploadPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadStep extends Base {
	
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

	@Given("Admin is on Manage Recording\\(Admin) page by clicking Manage Recordings tab")
	public void admin_is_on_manage_recording_admin_page_by_clicking_manage_recordings_tab() {
		UP.UploadRecordingGiven();
	}

	@When("Admin upload recording after selecting Batch and topic")
	public void admin_upload_recording_after_selecting_batch_and_topic(String BatchId,String Details,String FilePath) {
		UP.UploadeRecordingWhen(BatchId, Details, FilePath);
	}

	@Then("Uploaded recording will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void uploaded_recording_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic(String Message) {
	String alert = UP.CapturetextThen();
			Assert.assertEquals(alert,Message);
	}

	@When("Admin upload resources after selecting Batch and topic")
	public void admin_upload_resources_after_selecting_batch_and_topic(String BatchId,String Details,String FilePath) {
		UP.UploadeResourceswhen(BatchId, Details, FilePath);
	}

	@Then("Uploaded resources will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void uploaded_resources_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic(String Message) {
		String alert = UP.CapturetextThen();
		Assert.assertEquals(alert,Message);
	}

}
