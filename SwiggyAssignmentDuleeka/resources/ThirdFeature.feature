Feature: Test Login functionality of www.letskodeit.com
 
Scenario Outline: Test the valid login 
Given the login screen is opened 
When user enters <username> and <password> 
And clicks on Login button 
Then user should be navigated to Home Page.

@CucumberOptions(strict = false)

 
    Examples: 
      | username              | password           					| 
      | duleekalakm@gmail.com | !53NZY$HY]iM%Yp    					| 
      | aaaaabbbbb@gmail.com  | m3F5955wXbW%?yesA 					| 
			| cccccddddd@gmail.com  | m3F595!53NZY$HY]5wXbW%?yesA |