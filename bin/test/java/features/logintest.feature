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
Feature: Login Feature
 
  Scenario: Login with invalid values 
    Given the user in login page
    When an invalid username is entered
    And the password is entered
    And the login button is clicked
    Then Account doesn't match message is displayed
    
  
  Scenario: Login with proper details
    Given the user already in login page
    When n valid username is entered
    And valid password is entered
    And the login button is clicked1
    Then Login Successful
