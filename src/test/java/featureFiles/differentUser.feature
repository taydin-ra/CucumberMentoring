Feature: Login to basqar with different user

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
      | username | teacher_abai_school |
      | password | =pkFg4tf60AW      |
    Then User should login successfully
@SmokeTest
  Scenario: Create a Nationalities
    And Navigate to Nationalities page
    When User create a Nationalities