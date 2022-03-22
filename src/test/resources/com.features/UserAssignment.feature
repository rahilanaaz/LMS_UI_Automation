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

@UserAssignments
Feature: Assignment functions performed by User
Background : User is logged in,Batches and Classes were created already


Scenario: Check whether user can submit assignment 
Given User is on Manage Submissions(user) page to submit assignment
When User clicks on submit button after selecting Batch,Assignment Name,Assignment Date ,add comments (NO Screen exists to make selection and upload nor submit buttons)
Then Assignment will be submitted succesfully 


Scenario: Check whether user can edit a particular assignment
Given 	User is on Manage Submissions(user) page to edit submitted assignment
When User clicks on submit button after clicking on Edit icon to edit the required details
Then Updated Assignment will be submitted successfully


Scenario: Check whether user can delete  a particular assignment	
Given User is on Manage Submissions(user) page to delete submitted assignment
When User clicks on Trash icon after the assignment(NO Screen exists to make selection and upload nor submit buttons)
Then 	Assignment will be deleted successfully







