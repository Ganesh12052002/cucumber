@gpayTest

Feature: Validating payment Functionality


Scenario: Comment section one is working
Given user is logged in
When user enters comment
Then comment must be posted

Scenario: Comment section one is working
Given user is logged in two
When user enters comment two
Then comment must be posted two