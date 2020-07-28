
  Feature: Crate and Barrel

    Scenario Outline: Create new account
      When User in homepage
      And User click login button
      And User should be able to click create an account button
      And User select "<First Name>" from the option
      And User select "<Last Name>" from the option
      And User select "<Phone Number>" from the option
      And User select "<Email Address>" from the option
      And User select "<Ceate Password>" from the option
      And User click create button

      Examples: User fills out the form as followed from the table below:
      |First Name|Last Name|Phone Number|Email Address|Ceate Password|
      |ABCDEF     |GHIJK     |2242740515  |cnh@gmail.com|cnhsono123|




