Feature: Create an account
  Scenario: Creating account with valid credentials

    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button
    Then Verify I am in the product page

