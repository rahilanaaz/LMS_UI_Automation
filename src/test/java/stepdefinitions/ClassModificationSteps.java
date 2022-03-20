package stepdefinitions;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import com.base.Base;
import com.pages.ClassModificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClassModificationSteps extends Base{
	ClassModificationPage CMP;
	
	ClassModificationSteps(){
				super();
		}
	
	@Before
	public void beforeScenario() {
		 Base.initialize(prop.getProperty("browser"));
		 CMP = new ClassModificationPage();
		//here need to give login details and homepage details 
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	@Given("Admin is on Add tab by clicking on Add Class in Manage Classes page\\(admin)")
	public void admin_is_on_add_tab_by_clicking_on_add_class_in_manage_classes_page_admin() {
	  	   CMP.AddClassGiven();
	}

	@When("Admin clicks on submit button after entering the details")
	public void admin_clicks_on_submit_button_after_entering_the_details(String Topic,String Date,String Name,String Descrip,String Details) {
	    CMP.AddClassWhen(Topic, Date, Name, Descrip, Details);
	}

	@Then("Created Class will be displayed in Manage Classes Page\\(admin)")
	public void created_class_will_be_displayed_in_manage_classes_page_admin() {
	   CMP.AddClassThen();
	   }

	@Given("Admin is on Edit tab by cliking on Edit icon in Manage Classes page\\(admin)")
	public void admin_is_on_edit_tab_by_cliking_on_edit_icon_in_manage_classes_page_admin() {
	   
	   CMP.EditClassGiven();
	}

	@Then("Updated Class details will be displayed in Manage Classes Page\\(admin)")
	public void updated_class_details_will_be_displayed_in_manage_classes_page_admin(String Topic) {
	 String ClassTopic = CMP.EditClassThen();
	 Assert.assertEquals(ClassTopic, Topic);
	   
	}

	@Given("Admin is on Manage Classes Page\\(admin) by clicking on Manage Classes tab")
	public void admin_is_on_manage_classes_page_admin_by_clicking_on_manage_classes_tab() {
	  
	   CMP.DeleteClassGiven();
	}

	@When("Admin clicks on Trash icon of existing Class for particular Batch")
	public void admin_clicks_on_trash_icon_of_existing_class_for_particular_batch() {
	    CMP.DeleteClassWhen();
	}

	@Then("Deleted Class will be removed from Manage Classes Page\\(admin)")
	public void deleted_class_will_be_removed_from_manage_classes_page_admin(String Topic) {
		String ClassTopic = CMP.DeleteClassThen();
		 Assert.assertEquals(ClassTopic, Topic);
	}

	
}