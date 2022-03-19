@tag
Feature: Program Functions
  Different Program functions performed by Admin
  
  Background: Admin is logged into LMS portal

  @tag1
  Scenario: Check whether admin is able to see all existing programs
  Given Admin is on Manage Programs Page(admin) by clicking on Programs Tab
  When Admin tries to view exisiting program  details
  Then All the existing program details will be displayed in Manage Programs Page(admin)
   
  @tag2
  Scenario: Check whether admin can add new program details
  Given Admin is on Add tab in Add/Edit Programs page by clicking Add Program in Manage Programs Page(admin)
  When Admin clicks on submit button after entering the Program Name ,Program Description,Program Status
  Then All the program details will be added to Programs List in Manage Programs Page(admin) with auto generated same ProgramCreationtime and ProgramModifiedtime in   MM/DD/YY HH:MM format
  
  @tage3
  Scenario: Check whether admin can edit program details
  Given  Admin is on Edit tab in Add/Edit Programs page by clicking Edit icon in Manage Programs Page(admin)
  When Admin clicks on submit button after updating the required fields like Program Name ,Program Description,Program Status
  Then All the updated program details will be added to Programs List in Manage Programs Page(admin) with auto generated same ProgramCreationtime and modified Programtime MM/DD/YY HH:MM format
  
  @tag4
  Scenario: Check whether admin can delete the program
  Given Admin is on Manage Programs Page(admin) by clicking on Programs Tab
  When Admin clicks on Trash icon for any program in Programs List
  Then Program will be deleted from the Programs List in Manage Programs Page(admin)
  
  
  
  

  
    

    
