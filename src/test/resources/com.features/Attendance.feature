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
@attendance
Feature: Different attendance functions performed by Admin
Background: Admin is logged in,Batches and   various classes were already created ,Students are assigned to particular batch.
  
  Scenario: Check whether Admin can view the attendance details
    Given Admin is on Manage Attendance page
    When Admin Selects Batch,Class and Class Date 
    Then Student attendance can be viewed succesfully based on the selected criteria
    
  
  Scenario: Check whether Admin can save the attendance details
    Given Admin is on Manage Attendance page
    When Admin clicks on save button after selecting batch and class and marks the student as either "Present , Absent , Late, Excused , Unknown".
    Then Student attendance details will be saved  succeesfully .
    
  
  Scenario: Check whether Admin can reset the attendance details
    Given Admin is on Manage Attendance page    
    When Admin clicks on reset button after selecting batch , class and class date
    Then Default radio button "Unknown" will be selected for all the displayed students.
    
    


