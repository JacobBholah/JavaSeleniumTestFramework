Feature: Testing the Contents Table
  AS A User
  I WANT TO navigate to a specific section of the page
  SO THAT I can easily find what I'm looking for

  Scenario: Successfully navigate to a section
    Given I Want to go to a specific Section
    When I click the Section in the contents
    Then I expect the section to be visible