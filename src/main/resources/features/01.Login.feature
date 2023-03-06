Feature: Login User

  Scenario: User invalid login
    When User enter username password invalid
    And User click button login
    Then User stay in login page

  Scenario: User valid login
    When User enter username password valid
    And User click button login
    Then User go to product page