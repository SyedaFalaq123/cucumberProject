Feature: White Background
  As a Internal user I want to click on Set White Background button so that background color changes to White

  Scenario: internal admin are able to click on button to change background color
    Given a internal admin
    When admin enters Techfios website
    And clicks on Set white Background
    Then admin should see white background 
   
