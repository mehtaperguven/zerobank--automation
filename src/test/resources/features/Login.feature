@login
Feature: Login
  As I user I should be able to login

  Background: open login page
    Given user is on the login page

  Scenario: Login as an authorized user and verify that Account Summary Page is Displayed

    When user login as authorized user
    Then user should verify that  title is "Zero - Account Summary"

  #Scenario: Login with invalid username and password and verify that error message is displayed

    #When user login with wrong username or wrong password "wrong"
    #Then user should verify that "Login and/or password are wrong." message is displayed
    #When user login with blank username or blank password
    #Then user should verify that "Login and/or password are wrong." message is displayed
  @invalid
  Scenario: User login with invalid username and password and verify that error message is displayed
     Given user is on the login page
     When user enters invalid  username and password
      | username        | password    |
      | wrong           | password    |
      | username        | wrong       |
      |   ""            | password    |
      | username        |    ""       |
    Then user should verify that "Login and/or password are wrong." message is displayed

