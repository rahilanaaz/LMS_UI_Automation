Feature: feature to test Login functionality

Background: Admin or User is on LMS website.

@LoginPageValidation
Scenario: Checking login hyperlink is working

Given Admin or User is on LMS website page
When Admin or User clicks Login Hyperlink
Then Admin or User is on LoginPage.

@SubmitButton-PostiveScenario
Scenario: Check Login is successful with valid credentials

Given Admin or User is on Loginpage
When Admin or User enters UserName, Password, clicks Login Button
Then Admin or User is navigated to Home Page.

@SubmitButton-NegativeScenario
Scenario: Check Login is successful with invalid credentials

Given Admin or User is on LoginPage
When Admin or User enters Invalid UserName, Invalid Password, clicks Login Button
Then Admin or User is shown error message on same login page.

@ForgotPasswordButtonRegisteredEmailIds-PostiveCase
Scenario: Checking Forgot Password functionality

Given Registerd User is on LoginPage 
When Admin or User enters UserName, clicks forgot password Button.
And Admin or User is on answer security question page
Then Admin or User is shown with message: <password reset link has been sent to registered email address>.

@ForgotPasswardButtonUnRegisteredEmailIds-NegativeCase
Scenario: Checking unregisterd User functionality

Given UnRegisterd User is on LoginPage 
When Admin or User enters UserName, clicks forgot password Button.
Then Admin or User is shown with message: <provided email is not registered>.