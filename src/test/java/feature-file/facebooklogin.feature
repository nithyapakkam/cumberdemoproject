Feature: New facebook login

  Scenario: verification of successful login to facebook
    Given user on the facebook login page
    When user enters a valid username
    And user enters a valid password
    Then user select the submitt button and user login should be successful
