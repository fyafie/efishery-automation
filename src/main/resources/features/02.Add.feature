Feature: Add Item

  Scenario: User add item
    When User click item
    Then User get item in chart

  Scenario: User remove item
    When User click remove
    Then User removed item in chart