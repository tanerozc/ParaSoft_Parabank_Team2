Feature: Open New Bank Account

  Scenario: Successfully open a new checking account
    When Navigate to the webpage
    Then User logs in to the ParaBank website
    Then Click on the Open New Account link from the website menu
    Then Select Checking from the Account Type dropdown menu
    Then Verify message indicating that a minimum balance is required
    Then Select an existing account to transfer the initial balance from
    Then Click the Open New Account button
    Then Verify confirmation message and new account number are displayed