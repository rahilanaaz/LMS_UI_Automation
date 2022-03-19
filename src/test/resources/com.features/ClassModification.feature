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

Feature: Different Classes Modifications By Admin
Background : Admin is logged in,Batches and Classes were created already


Scenario: Check whether Newly Added Class details are visible to Admin

Given Admin is on Manage Classes Page(admin) by clicking on Manage Classes tab
When Admin Add a Class to Existing Batch
Then Newly Added Class details should display in Manage Classes Page(Admin)

@SubmitButton
Scenario: Check whether Edited classes details are visible to Admin

Given Admin is on Manage Classes Page(admin) by clicking on Manage Classes tab
When Admin Edit an existing Class
Then Updated class details should display in Manage Classes Page(Admin)

Scenario: Check whether Deleted classes is removed from Admin view

Given Admin is on Manage Classes Page(admin) by clicking on Manage Classes tab
When Admin Delete an existing Class
Then Deleted Class details will be removed from Manage Classes Page(Admin)

Scenario: Check whether Admin can able to see all existing classes details

Given Admin is on Manage Classes Page(admin) by clicking on Manage Classes tab
When Admin try to view exisiting Class details
Then All the existing Classes details are displayed in Manage Classes Page(Admin)













