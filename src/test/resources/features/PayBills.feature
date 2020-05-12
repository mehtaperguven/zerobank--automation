Feature: Pay Bills
  As user, I want to be able to see all titles in Account summary page

  Background:
    Given user is on the login page
    When user login as authorized user
    Then user navigates to Pay Bills page


  Scenario: Visit Account summary page and verify all titles
    And user verifies that page title is "Zero - Pay Bills"
    Given user is on the login page
    When user login as authorized user

