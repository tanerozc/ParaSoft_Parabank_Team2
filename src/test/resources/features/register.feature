Feature: User Registration

  Scenario: Successful user registration
    When Navigate to the website
    Then Click the Register button on the homepage
    Then Fill out the registration form using valid information
    Then Click the Submit button
    Then Verify confirmation message that new account was created
