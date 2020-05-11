@account_summary
Feature: Account summary
  As user, I want to be able to see all titles in Account summary page

  Scenario: Visit Account summary page and verify all titles
    Given user is on the login page
    When user login as authorized user
    Then user should verify that  title is "Zero - Account Summary"
    And Account summary page should have following account types
      | Cash Accounts        |
      | Investment Accounts  |
      | Credit Accounts      |
      | Loan Accounts        |
    And Credit Accounts should have following columns
      |Account    |
      |Credit Card|
      |Balance    |

