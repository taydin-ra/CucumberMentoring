Feature: Editing personal information

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button


  Scenario Outline: Editing personal information


    And Click on My Personal Information
    And Click on social title
    And type to"<First name>"and "<Last name>" and "<E-mail address>"
    And type "<Current Password>"and "<New Password>"
    And type in the confirm password "<New Password>"
    And Click on Save button
    Examples:
      | First name | Last name | E-mail address     | Current Password | New Password |

      | Zzz        | TTT       | ttorun16@gmail.com | 123456           | 12345678     |