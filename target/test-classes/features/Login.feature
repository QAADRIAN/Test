Feature: FEATURE TITLE
  I want to use this template for my feature file


  Scenario: Find JavaScript tutorial on w3School
    Given I am on the w3 school home page
    And I accept the privacy policy
    And I set input to "JavaScript"
    When I select the first option
    Then I am navigated to JavaScript tutorial
    And I assert that header is set to "JavaScript Tutorial"
