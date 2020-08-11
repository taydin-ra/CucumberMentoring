Feature: Create a new address

  Scenario:Creating a new address with the valid credentials

    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button
    And Click on My Address
    And Click on Add A New Address
    And Fill out the following
      | FirstName | Rana                    |
      | LastName  | Aydin                   |
      | Address   | 2430 Cogburn Ridge Road |
      | City      | Alpharetta              |
      | Zipcode   | 30004                   |
      | Phone     | 87654321                |
      | Reference | my address              |
      | State     | New Jersey              |

    And Click on Save button on the address page


