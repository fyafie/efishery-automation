Feature: Checkout Item

  Scenario: User checkout item
    When User click checkout
    And User input name
    And User input last name
    And User input zip
    And User click continue
    And User click finish
    Then User get success notification