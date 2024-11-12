#Autor .. Basma MAgdy
#Date .. 07/11/2024
#Description .. This is how to write a comment here

#@SmokeScenario
Feature: feature to test login functionality

 #@SmokeTest
  
  Scenario Outline: Check login is successful with valid user credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user pressed the login button
    Then user is navigated to the home page 
     
    Examples: 
     | username | password |
     | Admin     | admin123    |
     | usr2     | pass2    |
