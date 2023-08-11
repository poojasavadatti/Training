$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/blog.feature");
formatter.feature({
  "name": "Blog",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate blog entering functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is in blog page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.BlogPage.navigateSerachPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters data in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.BlogPage.enterProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.BlogPage.dataAppear()"
});
formatter.result({
  "status": "passed"
});
});