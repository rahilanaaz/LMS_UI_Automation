
Feature: Different Classes Modifications By Admin

Background: Admin is logged in,Batches and Classes with exisiting ID
 Given  Admin launch the URL
 When   Admin clicks login button after enters Username and Password 
 Then   Admin is navigated to the home page

Scenario: Check whether Admin can ADD New Class for Particular Batch

Given Admin is on Add tab by clicking on Add Class in Manage Classes page(admin)
When  Admin clicks on submit button after entering the details
Then  Created Class will be displayed in Manage Classes Page(admin)

Scenario Outline: Check whether Admin can Edit existing Class for particular Batch

Given Admin is on Edit tab by cliking on Edit icon in Manage Classes page(admin)
When  Admin clicks on submit button after entering the details
Then  Updated Class details will be displayed in Manage Classes Page(admin)

Example 
|ClassTopic|staffName|ClassDescription|ClassDate|
|Selenium|staff1|MyClassTest|20/Aug/2020|


Scenario: Check whether Admin can Delete existing Class for particular Batch

Given Admin is on Manage Classes Page(admin) by clicking on Manage Classes tab
When  Admin clicks on Trash icon of existing Class for particular Batch
Then  Deleted Class will be removed from Manage Classes Page(admin)














