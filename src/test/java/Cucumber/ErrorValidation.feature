
@tag
Feature: ErrorValidation
  I want to use this template for my feature file
 
 Background:
 Given Browser is launched_Invalid

 @Invalid
  Scenario Outline: Validate error message
    Given User landed on login page
    When User provides username<UserID> and password<password>
    And User clicks on Submit button
    Then Error message is verified

    Examples: 
      | UserID  | password |
      | ansubabu947@gmail.com |     random | 
      
