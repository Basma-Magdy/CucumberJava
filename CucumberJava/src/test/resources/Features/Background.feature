Feature: Check Home Page Functionality
	
	Background: user is logged in
			Given user is logged in
		#	Given user is on the login page
		#	When user enter his username and his password
		#	And user clicks on the login button
		#	Then user is navigated to home page
	
	Scenario: check logout link
			When user clicks the welcome link
			Then Logout link is displayed
	
	
	Scenario: Verify Quick launch toolbar is present
			When user clicks on dashboard link
			Then Quick launch toolbar is displayed



#Before it was like below ,, then after adding background it was like above

#Scenario: check logout link
#Given user is logged in
#When user clicks the welcome link
#Then Logout link is displayed

#Scenario: Verify Quick launch toolbar is present
#Given user is logged in
#When user clicks on dashboard link
#Then Quick launch toolbar is displayed