package stepdefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.base.Base;
import com.pages.UpLoadPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpLoadStep extends Base {

	UpLoadPage UP;
	String FilePath;
	String Displayed;
	String ResourceUpload;

	public UpLoadStep() {
		super();
	}

	@Before
	public void beforeScenario() {
		Base.initialize("chrome");
		UP = new UpLoadPage();

		// here need to give login details and homepage details
		UP.ManageRecording();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("Admin selecting {string} and {string}")
	public void admin_selecting_and(String Batch, String Topic) {
		UP.UploadRecordingGiven(Batch, Topic);
	}

	@When("Admin click upload recording  and Uploads {string}")
	public void admin_click_upload_recording_and_uploads(String FilePath) {
		UP.UploadeRecordingWhen(FilePath);
	}

	@Then("Uploaded Recording will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void uploaded_recording_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic() {
		Displayed = UP.CapturetextThen();
		Assert.assertEquals(Displayed, FilePath);
	}

	@When("Admin upload resources and Uploads {string}")
	public void admin_upload_resources_and_uploads(String FilePath) {

		UP.UploadeResourceswhen(FilePath);

	}

	@Then("Uploaded resources will be displayed in Manage Classes page\\(Admin View) for selected topic")
	public void uploaded_resources_will_be_displayed_in_manage_classes_page_admin_view_for_selected_topic() {

		ResourceUpload = UP.CapturetextThen();
		Assert.assertEquals(ResourceUpload, FilePath);

	}

}
