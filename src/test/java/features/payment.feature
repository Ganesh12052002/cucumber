
Feature: Validating payment Functionality

@gpayTest
Scenario: Gpay integration is selected
Given user already has an account on gpay
When userid is correct
Then gpay message should be sent

@phonepeTest
Scenario: Phonepe integration is selected
Given user already has an account on Phonepe
When userid is correct
Then Phonepe message should be sent