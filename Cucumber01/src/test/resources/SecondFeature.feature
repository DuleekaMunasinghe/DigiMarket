Feature: Check Login Functionality
 
Scenario: Successful Login with Valid Credentials 
Given the login screen is opened 
When user enters "cccccddddd@gmail.com" and "m3F595!53NZY$HY]5wXbW%?yesA" 
And clicks on Login button 
Then user should be navigated to Home Page.