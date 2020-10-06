Feature: Adding some items to the shopping cart
Scenario Outline: verify Shrine Gallery Page
Given open app and swipe to left on slider
When click shrane tab on slider and login using username <Username> password <Password>
Then Shrine Gallery Page is displayed

Examples:
|Username				|Password	|
|" fedyfahron@gmail.com"	|"Test1234"	|


Scenario: Add Item
Given has success access Shrine Gallery Page
When select item
Then the item will be add to cart

Scenario: Checking the total of the shopping cart
Given has success access cart page
When some item on shopping cart
Then the total price is correct

Scenario: Clearing the shopping cart
Given has success select two item and access cart page
And two items on shopping cart
When click clear button
Then all item in cart removed