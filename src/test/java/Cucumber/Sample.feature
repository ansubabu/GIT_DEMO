
@tag
Feature: Login Functionality
  I want to use this template for my feature file
  
Background:
Given Browser is launched 
  

  @validcredential
  Scenario Outline: Login With Valid Credentials
    Given I have landed on login page
    When User enter username <userid> and password <password> credentials
    And User clicks Submit
    Then User is logged in successfully


    Examples: 
      | userid  							| 		password 						| 
      | ansubabu947@gmail.com |     rahulshettyacademy | 
  
    
     