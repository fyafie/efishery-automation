Feature: Add Candidate
  
  Scenario: User valid add candidate
    When User click recruitment
    And User click add candidate
    And User enter full middle and last name
    And User select vacancy
    And User enter email
    And User enter phone number
    And User upload resume
    And User enter keyword
    And User enter date of application
    And User enter notes
    And User click consent to keep data
    And User click save button
    Then User get success notification

  Scenario: User invalid add candidate
    When User click recruitment
    And User click add candidate
    And User enter full middle and last name invalid
    And User enter email invalid
    And User enter phone number invalid
    And User upload resume invalid
    And User click save button
    Then User get failed notification    