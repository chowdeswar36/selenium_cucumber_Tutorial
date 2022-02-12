Feature: Practice Assessements

  Scenario: checking the Assessement 1
    Given user opens the browser
    When user opens the url "http://qatechhub.com"
    Then the page title should be "QA Automation Tools Trainings and Tutorials | QA Tech Hub"
    When user navigate to "https://www.facebook.com"
    And user navigate to back url
    Then user prints the title of the page
    And user navigate to forward and refresh the page
    And close the browser

  Scenario: checking the Assessement 2
    Given user opens the browser
    When user opens the url "https://www.facebook.com"
    Then the page url should be "https://www.facebook.com/"
    And user check the "Create New Account" on the page and click
    When user enter all the required details
    And user clicks on the Create an account button
    Then user verify the account is created or not
    And close the browser

  Scenario: checking the assessement 3
    Given user opens the browser
    When user opens the url "https://www.flipkart.com/"
    Then user finds the number of links in home page
    And user prints linktext and url of the each link
    And close the browser

  Scenario: checking the assessement 4
    Given user opens the browser based on your selection
    When user opens the url "https://www.flipkart.com/"
    And user searches "apple mobiles 12 pro max" on home page and click search
    And user select internal storage dropdown as 256 GB & Above
    Then user prints the total products
    And user prints each product name and product link
    And user prints the required nth product 5

  Scenario: checking the assessement 5
    Given user opens the browser based on your selection
    When user opens the url "https://www.facebook.com/"
    And user enters the login credentials and click on login
    Then user should get the page title "Facebook"
    When user clicks logout button
    Then user should get "Add Account"
    And close the browser

