Feature: Login to basqar
  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    |username|daulet2030@gmail.com|
    |password|TechnoStudy123@     |
    Then User should login successfully
@SmokeTest
  Scenario: Create a Nationalities
    And Navigate to Nationalities page
    When User create a Nationalities







