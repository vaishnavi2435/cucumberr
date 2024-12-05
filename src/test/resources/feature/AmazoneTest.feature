@All
Feature: test the amazone app

  Background: 
    Given open amazone app

  @HomePage @Regression
  Scenario: Test Tittle of Homepage
    When user get tittle of Homepage
    Then Tittle of Homepage should be match

  @BestsellerPage
  Scenario: Test Tittle of Bestsellerspage
    When user open Bestseller page
    And user get Tittle of Bestsellerpage
    Then Tittle of Bestseller should be match

  @MobilePage
  Scenario: Test tittle of Mobilepage
    When user open  Mobilepage
    And user get Tittle of Mobilepage
    Then Tittle of Mobilepage should be match

  @AmazonepayPage
  Scenario: Test tittle of Fashionpage
    When user open  Fashionpage
    And user get Tittle of Fashionpage
    Then Tittle of FashionPage should be match
