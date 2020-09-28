
@Positive
Feature: Login Features
This feature includes scenario that would validate the following features
1.Login as Admin
2.Login as Linda Anderson
3.Login with Negative data

Background:
Given I am able to navigate onto the login page

#same step in every scenario, therefore added on to Background


#Scenario: Login as Admin
#When I enter the username as "Admin" 
#And I enter the password as "admin123" 
#And I click on the login button
#Then I should see the username as "Welcome Linda" 
#
#
#Scenario: Login as linda.anderson
#When I enter the username as "linda.anderson" 
#And I enter the password as "linda.anderson" 
#And I click on the login button
#Then I should see the username as "Welcome Linda"

#Scneario Outline convert multiple scenario into single scenario, and 
#Data Driven Test with one scenario


Scenario Outline: login with different user
When I enter the username as "<user>" 
And I enter the password as "<pwd>" 
And I click on the login button
Then I should see the username as "<name>" 

Examples:
|user						|pwd						|name						|
|Admin					|admin123				|Welcome Linda |
|linda.anderson |linda.anderson	|Welcome Linda	|


@Negative
Scenario: Login as Negative Date
When I enter the username as "Linda.anderson" 
And I enter the password as "Linda.anderson" 
And I click on the login button
Then I should see a Error message as "Invalid credentials"