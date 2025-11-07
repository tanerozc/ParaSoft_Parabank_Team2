Feature: Login Functionality

  @Smoke
  Scenario: Login with valid data
    When Navigate to the same webpage
    Then Enter username and password
    Then Click login button
    Then Verify Home page opened

