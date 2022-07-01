Feature: Application login





Scenario: Home page default login

Given User is on netbanking
When  user login into application wit username and password 
Then Home page is populated 
And Cards are displayed               