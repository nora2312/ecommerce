@smoke
  Feature: F01_Register | user can register with new accounts
    Scenario: user can register in website

      Given user open register page
      And user select gender type
      And user enter fristname "nora" and lastname "Zakeria"
      And user enter brithday
      And user enter email
      And user enter password fields "P@ssw0rd" "P@ssw0rd"
      When user click register button
      Then  user registered successfully
