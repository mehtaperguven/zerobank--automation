Feature: Pay Bills
  As user, I want to pay successfully.

  Background:
    Given user is on the login page
    When user login as authorized user
    Then user navigates to "Pay Bills" page

  Scenario: user completes Pay operation successfully and verifies success message is displayed.
    When user verifies that page is "Pay Bills" and title is "Zero - Pay Bills"
    Then user enters  amount , date and description information
    |amount|     date     |description     |
    | 400  |  2020-05-11  |  very urgent   |
    And user should verify that following "The payment was successfully submitted." message is displayed

