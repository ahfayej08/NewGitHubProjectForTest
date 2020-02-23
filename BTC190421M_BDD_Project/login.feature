Feature: Login Validation

Background:
Given open browser
|chrome|
|edge|
And nevigate to url

@smoke
Scenario: as a user i should be able to login using valid crediantial


When user type userid in email text box
And user type password in password text box
And user click on login button
Then user should see his profile page


@regression
Scenario Outline: as a user i should not be able to login using invalid crediantial


When user type <"userid"> in email text box
And user type <"password"> in password text box
And user click on login button
Then user should not see his profile page

Examples:
|userid|password|
|user1|s1212|
|user2|s3321212|
|user3|s2231212|