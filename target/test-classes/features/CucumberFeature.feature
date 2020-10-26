Feature: LoginFeature
This feature is responsible for testing login scenarios

Scenario:Check Login with correct username and password

Given I see the application opened
Then I click Login link
When I enter Username and Password
|Username|Password|
|admin	 |password|
Then I click Login buton
Then I should see the hello message on home screen

