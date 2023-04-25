Feature: add cocktail to the database
  AS A customer
  I WANT TO add a cocktail to the database
  SO THAT I have it for later use

  Scenario: Successfully add cocktail
    Given the cocktail doesnt exist
    And a cocktail name and type is given
    When I try to add the cocktail
    Then the cocktail shall appear in the database

  Scenario: unsuccessfully add cocktail
    Given the cocktail already exists
    When I try to add the cocktail
    Then the cocktail is already in the database

  Scenario: unsuccessfully add cocktail
    Given the cocktail doesnt exist
    And no cocktail name or type is given
    When I try to add the cocktail
    Then the cocktail will not be added