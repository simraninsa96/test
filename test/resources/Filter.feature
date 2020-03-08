Feature: filter
  As an end user
  I want to apply filters
  So that i can find desired product

  Scenario: Filter by review
    Given I am at homepage
    When  I search for a product "nike"
    And I apply filter  review "3or more"
    Then I should be able to see refined results review "3.0"

  Scenario: Filter by brand
    Given I am at homepage
    When  I search for a product "nike"
    And I apply filter  review "apple"
    Then I should be able to see refined results review "apple"
