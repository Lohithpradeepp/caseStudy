Feature: Signin

 Scenario Outline: Login to testmeapp
   Given I want to login
   When Open the testmeapp using url
   Then Click on the SignIn button
   Then Give the inputs "<userName>" and "<password>"

   And Click on the submit button
   
  Examples:
     |userName|password   |
     |lalitha |password123|