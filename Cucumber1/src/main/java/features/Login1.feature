Feature: Login1 feature Test

  Scenario: Login scenario Test
    Given user is on the login page
    When user enters username and password
    And user clicks on login button
    Then user should be successfully logged in

    