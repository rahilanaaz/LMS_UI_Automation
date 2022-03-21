#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Assignment functions performed by Admin
Background : Admin is logged in,Batches and Classes were created already


@AdminAssignments
Scenario: Check whether Admin can add New assignments for particular Batch
Given Admin is on Add tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)
When Admin clicks on submit button after selecting Batch and enters Assignment name, Assignment Description , Assignment Due, Upload assignments
Then Created assignments will be displayed in Manage Assignments Page(admin) and/or Manage Assignment page(User View)

Scenario: Check whether Admin can add Edit assignments for particular Batch
Given Admin is on Edit tab of manage Assignments page(admin view) by clicking on Add Assignment in Manage Assignments Page(admin)
When Admin clicks on submit button after updating one or more assignment details
Then Updated assignment details will be displayed in Manage Assignments Page(admin) and or Manage Assignment page(User View)

Scenario: Check whether Admin can Delete existing assignments for particular Batch
Given Admin is on Manage Assignments Page(admin)
When Admin clicks on Trash icon after selecting existing assignments
Then Deleted assignment will be removed from Admin View in Manage Assignments Page(admin) and Manage Assignment page(User View)

Scenario: Check whether Admin can manage students submission by selecting Make Grade Visible	
Given Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)	
When Admin clicks on submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,Make Garde Visible and add comments 	
Then Grade Details will be visible to both Admin and User View

		
 Scenario: Check whether Admin can manage students submission by unselecting Make Grade Viisble	
Given Admin is on Manage Submissions(Admin) page by clicking on Manage button in Manage assignments page(admin)	
When Admin clicks on Submit button after selecting all the details like Batch,Assignment Name,Assignment Date ,Grade By ,Grade ,add comments 	
Then Grade Details will be visible only to Admin 
		














