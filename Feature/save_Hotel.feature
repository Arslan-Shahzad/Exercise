Feature: Save Last Seen

Scenario: Saved hotel at home page
	Given The user has landed on the Offer Summary page
	When The user goes back to home page
	Then The user will see the box “Still interested in a holiday to Zante?” box on the home page 
	When Clicks on Book this room
	Then The user is taken to the offer summary (same page as above) of the same hotel