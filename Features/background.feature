Feature: check home page functionality

  Background: check login function
    Given user is on the login page
    When user enters the username and password
    And user clicks on the login
    Then user navigated to login page

  Scenario: check logout function
    When user clicks on the application link
    Then user able to see logout button

  Scenario: check dashboard function
    When user clicks on the dashboard link
    Then user able to see dashboard
