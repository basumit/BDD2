@jbk
Feature: JBK login application
@jbk1
Scenario Outline: login test

Given user on login page
When  user enters valid "<username>" and "<password>"
Then user verify "<title>"

Examples:
|username       |password   |title    |
|kiran@gmail.com|123456     |Log in   |
|sumit@gmail.com|qwerty     |Log in   |
|suraj@gmail.com|123489     |Log in   |

@jbk2
Scenario:logo test
Given user on login page
Then user Should see JBK logo
