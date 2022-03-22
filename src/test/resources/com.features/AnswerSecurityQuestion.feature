Feature: feature to test Answer Security Question Page

@ForgotPasswordButtonRegisteredEmailIds-PostiveCase
Scenario Outline: Checking Forgot Password functionality

Given Registerd User after clicking forgot password button, is on Answer Security Page 
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

