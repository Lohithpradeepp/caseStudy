Feature: Payment

	Scenario Outline:	Login to TestMeApp
	Given Open the TestMeApp
	And Login to the TestMeApp 
	Then Inputs "<username>" and "<password>"
	And Click On login button
	
	Examples:
	|username|password|
	|AlexUser|Alex@123|
	
	Scenario:The one the user moves to cart without adding any item to the cart
	Given Alex has registered to the TestMeApp
	When Alex searches for a particular product like headphones
	And try to proceed to payment without adding to the cart
	Then TestMeApp doesnot show the cart item