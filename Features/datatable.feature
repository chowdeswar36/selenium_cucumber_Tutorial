Feature: datatable

  Scenario: practicing the datatable concept
    Given user opens the browser
    When user opens the url "https://opensource-demo.orangehrmlive.com/"
    And user enters the username and password
      | username | password |
      | Admin    | admin123 |
    And click on login
    Then user should get the welcomepage
    When user click on logout
    Then user should get the login panel
    And close the browser
