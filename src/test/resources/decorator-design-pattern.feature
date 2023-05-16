Feature: Decorator Design Pattern

Scenario: Ordering a specific type of coffee
	Given a coffee shop
	And a customer ordering a specific type of coffee
	When the customer adds additional toppings
	Then the coffee should be customized with the toppings	