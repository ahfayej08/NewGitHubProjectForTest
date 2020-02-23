Feature: Openning Browser Validation

Scenario: as a user i should be able to see the main page

Given open edge browser
And nevigate to url
When home page title is displayed or not
And if logo is match
Then close edge browser