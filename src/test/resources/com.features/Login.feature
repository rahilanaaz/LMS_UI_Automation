Feature: feature to test Login functionality
@SubmitButton 
Scenario: Check Login is successful with valid credentials

Given Admin or User is on LoginPage
When Admin or User enters UserName, Password, clicks Login Button
Then Admin or User is navigated to Home Page.
@SubmitButton
Scenario: Check Login is successful with invalid credentials

Given Admin or User is on LoginPage
When Admin or User enters Invalid UserName, Invalid Password, clicks Login Button
Then Admin or User is shown error message on same login page.

@ForgotPasswordButton
Scenario: Checking Forgot Password functionality

Given Registerd User is on LoginPage 
When Admin or User enters UserName, clicks forgot password Button.
And Admin or User is on answer security question page
Then Admin or User is shown with message: <password reset link has been sent to registered email address>.

@ForgotPasswardButton
Scenario: Checking unregisterd User functionality
Given Registerd User is on LoginPage 
When Admin or User enters UserName, clicks forgot password Button.
And Admin or User is on answer security question page
Then Admin or User is shown with message: <provided email is not registered>.