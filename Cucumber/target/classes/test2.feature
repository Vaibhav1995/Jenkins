Feature: login feature

Scenario: login with valid credentials
Given open the browser and login page
When User enters valid username and password 
Then Login should be successfull

Scenario: login with invalid credentials (username and invalid password)
Given open the browser and login page
When User enters valid username and invalid password
Then Login should be unsuccessfull