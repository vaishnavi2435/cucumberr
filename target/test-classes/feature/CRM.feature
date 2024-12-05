Feature: open the app crm application

  Background: 
    Given open crm page
    When user click on signin link

  Scenario: Test the Crm signin link
    #When user click on signin link
    Then signin page should open

  Scenario: Test crm login
    #Given user click on signin link
    And user enter valid credentials "test@gmail.com" and "test123"
    And user click on submit button
    Then user should able to login and navigate to coustmer page
