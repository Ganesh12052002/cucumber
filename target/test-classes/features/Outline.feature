@OutlineTest
Feature: Validating Login Functionality

Scenario Outline: Test Successful login case outline
Given User is on the login screen outline
When user provides correct username outline=<username>
And user provides correct password outline=<password>

Examples:
|username|password|
|"userA"|"passA"|
|"userB"|"passB"|