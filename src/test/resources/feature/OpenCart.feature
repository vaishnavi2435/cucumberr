Feature: Test the application opencart

  @register
  Scenario: Test the Register for opencart
    Given user enter required data
      | fname     | Lname  | email               | tele       | psw     | cpsw    |
      | vaishnavi | Habare | kiran2024@gmail.com | 9226850187 | test123 | test123 |
    When user click on yes readio button
    And click on privacy policy
    And click on continue button
    Then user should be register sucessful

  @login
  Scenario: test the login page
    Given user required the data
      | kiran2024@gmail.com | test123 |
    When click on the login btn
    Then user should be login sucessful
