Feature: open Hrm apllication

  Scenario Outline: Test data driver for login
    Given open the Hrm application
    When user enters "<username>" and  "<password>"
    And click on login button
    Then user should be login navigated to dashboard page

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | sid      | test123   |
      | Admin    | admin123  |
      | vaishu   | vaishu123 |
