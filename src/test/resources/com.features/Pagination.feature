Feature: Pagination
  Background: Admin is logged in & Programs, Batches and Users(Registered and Unregistered) are created already
 

Scenario: Check functionality of Pagination at Manage user(Admin) page
Given Admin is on the Home page
When Admin clicks on manage user(admin) link
Then Admin will be navigated to Manage users(admin) pageLarge number of user records will be divided into smaller discrete pages 

Scenario: Check functionality of Pagination at Manage Attendance(Admin and Class Staff) page
Given Admin is on  Manage Attendance(Admin and Class Staff) page of Manage Attendance(admin) admin is the home page
When result is containing many  Student records admin clicks on Manage Attendance(Admin and Class Staff link
Then Large number of Student records will be divided into smaller discrete pages