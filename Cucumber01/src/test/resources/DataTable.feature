Feature: Test Login functionality of www.letskodeit.com using DataTable
 
Scenario: Test the valid login  using DataTable
Given the login screen is opened 
When user enters credentails using DataTable 
| duleekalakm@gmail.com | !53NZY$HY]iM%Yp    					|
And clicks on Login button 
Then user should be navigated to Home Page.
