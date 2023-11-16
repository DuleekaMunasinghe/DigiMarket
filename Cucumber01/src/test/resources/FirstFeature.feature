Feature: Check Login Functionality
 
Scenario: Successful Login with Valid Credentials 
Given the login screen is opened 
When user enters "duleekalakm@gmail.com" and "!53NZY$HY]iM%Yp" 
And clicks on Login button 
Then user should be navigated to Home Page.

Scenario: Successful Login with Valid Credentials 
Given the login screen is opened 
When user enters "aaaaabbbbb@gmail.com" and "m3F5955wXbW%?yesA" 
And clicks on Login button 
Then user should be navigated to Home Page.