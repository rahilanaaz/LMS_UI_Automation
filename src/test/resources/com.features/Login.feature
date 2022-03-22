Feature: feature to test Login functionality

Background: Admin or User is on LMS website.

@LoginPageValidation
Scenario: Checking login hyperlink is working

Given Admin or User is on LMS website page
When Admin or User clicks Login Hyperlink
Then Admin or User is on LoginPage.

@SubmitButton-PostiveScenario
Scenario Outline: Check Login is successful with valid credentials

Given Admin or User is on Loginpage
When Admin or User enters <UserName>, <Password> clicks Login Button
Then Admin or User is navigated to Home Page.

Examples: 
| UserName|Password |
|user1 |pass1 |
|user2 |pass2 |

@SubmitButton-NegativeScenario
Scenario Outline: Check Login is successful with invalid credentials

Given Admin or User is on LoginPage
When Admin or User enters <InvalidUserName>, <InvalidPassword>, clicks Login Button
Then Admin or User is shown error message on same login page.

Examples:
| InvalidUserName|InvalidPassword |
|user1 |pass2 |
|user2 |pass1 |

@ForgotPasswordButtonRegisteredEmailIds-PostiveCase
Scenario Outline: Checking Forgot Password functionality

Given Registerd User after clciking forgot password button, is on Answer Security Page 
When Registerd User enters <UserName>, clicks next button.
And Registerd User enters answer for Security Question.
Then Registerd User is shown with message: <Password Reset Link has been sent to Email Address>.

Examples:
| UserName|
|user1 |
|user2 |

@ForgotPasswardButtonUnRegisteredEmailIds-NegativeCase
Scenario Outline: Checking unregisterd User functionality

Given UnRegisterd User after clciking forgot password button, is on Answer Security Page 
When UnRegistered user enters <UserName>, clicks next button.
And UnRegistered user enters answer for Security Question.
Then UnRegistered is shown with message: <Provided Email Id is not registered>.

Examples:
| UserName|
|user1 |
|user2 |