#Developer: Mani
#Last Updated on:
@SampleTest @Regression 
Feature: Validate the login
	Background:
		Given User opens browser
		And User login with credentials
		
	Scenario: To Validate the login functionality
		When User click on logout button
		
		Then User logout from the web site
		
		
		
#		Scenario: To validate the Trouble logging in functioanlity
#		When User clicks on Trouble logging in link
#		Then User naviagtes to Forgot User ID / IPIN page
#		When User clicks on Retrieve ID link
#		Then User navigates to Forgot your User ID page 
#		
		
		
		
		