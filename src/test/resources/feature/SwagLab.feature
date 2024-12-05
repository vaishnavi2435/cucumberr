Feature: test the swaglab application

  Scenario: the test login with valid credentials
    Given user open the application
    When user enter valid Username and valid Password
    And user click on login button
    Then user shoud able to login and navigate to inventory page
