$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Dressespage.feature");
formatter.feature({
  "name": "Dresses page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Put all five dresses into cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at homepage and validate the title",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_at_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click on the Dressestab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.dresstab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrolldown and put to cart all five dresses",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.select_dresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user move to summry page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.checkoutprocess()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Homepage.feature");
formatter.feature({
  "name": "Homepage Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the logo and title and move to Dresses tab",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at homepage and validate the title",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_at_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the logo",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click on the Dressestab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.dresstab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Summrypage.feature");
formatter.feature({
  "name": "Summrypage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check all Dresses are right",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is at homepage and validate the title",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_at_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Click on the Dressestab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.dresstab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrolldown and put to cart all five dresses",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.select_dresses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user move to summry page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.checkoutprocess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify all the prices",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.verify_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Total price equal to sum of each prices",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.sum()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});