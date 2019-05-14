Feature: Summrypage
Scenario: Check all Dresses are right

 Given user is at homepage and validate the title
 Then user Click on the Dressestab
 Then user scrolldown and put to cart all five dresses
 Then user move to summry page
 Then user verify all the prices
 Then Total price equal to sum of each prices
 