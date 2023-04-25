Feature: add garnish to the database
  AS A customer
  I WANT TO add a garnish to the database
  SO THAT I have it for later use

  Scenario: Successfully add garnish
    Given the garnish doesnt exist
    And a garnish name is given
    When I try to add the garnish
    Then the garnish shall appear in the database

  Scenario: unsuccessfully add garnish
    Given the garnish already exists
    When I try to add the garnish
    Then the garnish shall appear in the database

  Scenario: unsuccessfully add garnish
    Given the garnish doesnt exist
    And no garnish name is given
    When I try to add the garnish
    Then the garnish shall not appear in the database