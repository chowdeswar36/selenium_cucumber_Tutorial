Feature: Test login functionality

  Scenario Outline: check the login page with login credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user click on login button
    Then user is navigated to the home page

    Examples: 
      | username   | password |
      | Raghav     |    12345 |
      | chowdeswar |    12345 |
