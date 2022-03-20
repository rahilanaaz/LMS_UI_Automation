package stepdefinitions;

import org.testng.Assert;

import com.base.Base;
import com.pages.AttendancePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AttendanceSteps extends Base {
	
	AttendancePage AttendancePg = new AttendancePage();
	
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
	
	@Given("Admin is on Manage Attendance page")
	public void admin_is_on_manage_attendance_page() {
		AttendancePg.goToAttendancePg();
	}

	@When("Admin Selects Batch,Class and Class Date")
	public void admin_selects_batch_class_and_class_date(String batch, String className, String classDate) {
		AttendancePg.selectBatch(batch);
		AttendancePg.selectClass(className);
		AttendancePg.selectClassDate(classDate);
	}

	@Then("Student attendance can be viewed succesfully based on the selected criteria")
	public void student_attendance_can_be_viewed_succesfully_based_on_the_selected_criteria() {
	    Assert.assertNotEquals(AttendancePg.getStudents(),0);
	}

	@When("Admin clicks on save button after selecting batch and class and marks the student as either {string}.")
	public void admin_clicks_on_save_button_after_selecting_batch_and_class_and_marks_the_student_as_either(String attendanceStatus) {
		AttendancePg.selectAttendanceStatus(attendanceStatus);
		AttendancePg.clickSave();
	}

	@Then("Student attendance details will be saved  succeesfully .")
	public void student_attendance_details_will_be_saved_succeesfully(String attendanceStatus) {
		Assert.assertTrue(AttendancePg.getAttendanceStatus(attendanceStatus));
	    
	}

	@When("Admin clicks on reset button after selecting batch , class and class date")
	public void admin_clicks_on_reset_button_after_selecting_batch_class_and_class_date() {
	    AttendancePg.clickReset();
	}

	@Then("Default radio button {string} will be selected for all the displayed students.")
	public void default_radio_button_will_be_selected_for_all_the_displayed_students() {
	    Assert.assertTrue(AttendancePg.chkDefaultStatus());
	}

}
