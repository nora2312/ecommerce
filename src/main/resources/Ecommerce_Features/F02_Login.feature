@smoke
Feature: F02_Login | user can login to website
    ## Scenario 1
  Scenario: user could login with vaild email and password
    Given user go to login page
    And user enter email "Nh@gmail.com" and password "P@ssw0rd"
    When user press login button
    Then user can login successfully

## Scenario 2
  Scenario: user could login with invaild email and password
    Given user go to login page
    And user enter email "email@gmail.com" and password "P@ssw0rd"
    When user press login button
    Then user could not login to the system