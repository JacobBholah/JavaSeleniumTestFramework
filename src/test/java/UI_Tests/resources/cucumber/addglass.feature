Feature: add ingredient to the database
  AS A customer
  I WANT TO add a glass to the database
  SO THAT I have it for later use

  Scenario: Successfully add glass
    Given the glass doesnt exist
    And a glass name is given
    When I try to add the glass
    Then the glass shall appear in the database

  Scenario: unsuccessfully add glass
    Given the glass already exists
    When I try to add the glass
    Then the glass shall appear in the database

  Scenario: unsuccessfully add glass
    Given the glass doesnt exist
    And no glass name is given
    When I try to add the glass
    Then the glass shall not appear in the database