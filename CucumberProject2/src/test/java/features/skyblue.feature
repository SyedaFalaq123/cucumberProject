Feature: Sky blue Background
  As a external user I want to be able click on Set SkyBlue Background button so that background color changes to Sky Blue

  Scenario: external users are able to click on button to change backgrounf color
    Given a external user
    When user visits Techfios Test Page
    And clicks on Set Sky Blue Background
    Then background color should change to Sky blue
   
