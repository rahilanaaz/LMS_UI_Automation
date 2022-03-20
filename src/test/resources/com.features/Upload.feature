Feature:Different Upload features by Admin

BackGround: Admin is logged in created Batches and Classes
 Given  Admin launch the URL
 When   Admin clicks login button after enters Username and Password 
 Then   Admin is navigated to the home page
 
@tag1
Scenario: Check whether Admin can upload Recording 
Given Admin is on Manage Recording(Admin) page by clicking Manage Recordings tab
When Admin upload recording after selecting Batch and topic
Then Uploaded recording will be displayed in Manage Classes page(Admin View) for selected topic

@tag2
Scenario: Check whether Admin can upload Resources
Given Admin is on Manage Recording(Admin) page by clicking Manage Recordings tab
When Admin upload resources after selecting Batch and topic
Then Uploaded resources will be displayed in Manage Classes page(Admin View) for selected topic