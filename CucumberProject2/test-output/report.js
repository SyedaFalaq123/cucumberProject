$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/white.feature");
formatter.feature({
  "line": 1,
  "name": "White Background",
  "description": "As a Internal user I want to click on Set White Background button so that background color changes to White",
  "id": "white-background",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "internal admin are able to click on button to change background color",
  "description": "",
  "id": "white-background;internal-admin-are-able-to-click-on-button-to-change-background-color",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a internal admin",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "admin enters Techfios website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on Set white Background",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "admin should see white background",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "whiteSteps.admin_enters_Techfios_website()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "whiteSteps.admin_should_see_white_background()"
});
formatter.result({
  "status": "skipped"
});
});