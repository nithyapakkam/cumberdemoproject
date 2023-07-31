Feature: New User Registraion

  Scenario: Verification of successful registration when the inputs are correct
    Given User on the user registration page
    When User enters a valid Full Name
    And User enters a valid Email
    And User enters a valid Phone Number
    And User enters a valid Fax Number
    And User upload Profile
    And User select Gender
    And User select Experience
    And User  select Skills
    And User select Automation Tools
    Then user clicks the submit button and the user registration should be successful
