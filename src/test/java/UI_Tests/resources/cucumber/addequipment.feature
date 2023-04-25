Feature: add equipment to the database
  AS A customer
  I WANT TO add equipment to the database
  SO THAT I have it for later use

  Scenario: Successfully add equipment
    Given the equipment doesnt exist
    And a equipment name is given
    When I try to add the equipment
    Then the equipment shall appear in the database

  Scenario: unsuccessfully add equipment
    Given the equipment already exists
    When I try to add the equipment
    Then the equipment shall appear in the database

  Scenario: unsuccessfully add equipment
    Given the equipment doesnt exist
    And no equipment name is given
    When I try to add the equipment
    Then the equipment shall not appear in the database