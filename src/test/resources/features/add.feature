Feature: Add

Scenario: Add using Java source object
Given I have a Java based adder
When I add 1 and 2
Then I get 3

Scenario: Add using Groovy source object
Given I have a Groovy based adder 
When I add 2 and 2
Then I get 4

@wip
Scenario: Example scenario that is not ready to automate (hence the @wip tag)
Given I have a Groovy based multiplier 
When I multiply 3 with 3
Then I get 9