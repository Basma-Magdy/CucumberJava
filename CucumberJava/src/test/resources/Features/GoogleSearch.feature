Feature: feature to test GoogleSearch functionality

@SmokeTest  @Regression

  Scenario: Validate that google search is working 
    Given Browser is open
    And user is on google search page
    When user enters a text in google search bar
    And user hits enter
    Then user is navigated to search resuts

