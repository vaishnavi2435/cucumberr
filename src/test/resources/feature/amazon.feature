Feature: Test  amazone application

  Background: 
    Given open the amazone application

  Scenario: Test the Tittle of amazon application
    # Given open the amazon application
    When user get the current tittle of the application
    Then tittle should be matched with amazone

  Scenario: Test search for valid Keyword
    # Given open the amzone application
    When user search for valid keyword into amazone search
    Then user should get valid search result
