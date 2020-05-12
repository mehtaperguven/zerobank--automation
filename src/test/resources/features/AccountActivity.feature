@account_activity
Feature: Account activity
  As a user, I want to be able to see all dropdown menu in Account summary page

  Background:
              Given user is on the login page
              When user login as authorized user
              Then user navigates to account activity page
              And user verifies that page is "Account Activity" and title is "Zero - Account Activity"
 # @account_activity1
  Scenario: Visit Account activity page and verify dropdown menu

    When user verify dropdown default option is "Savings"
    Then user verify dropdown menu has following data
    |Savings    |
    |Checking   |
    |Savings    |
    |Loan       |
    |Credit Card|
    |Brokerage  |

@account_activity2
  Scenario: Visit Account activity page and verify transactions table titles are Date, Description,Deposit and Withdrawal

    And transactions table should have following data
    |Date        |
    |Description |
    |Deposit     |
    |Withdrawal  |



