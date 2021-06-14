# designPatterns
Visitor design pattern is confusing beacause it can be applied in various places.

The example demonstrates the following:-

One has ordered Pizza and Biryani from Swiggy. He wants to know the cost of all the items together.
He may have ordered Pizza of different sizes and cost of each would be different. 
So the customer wants to know the total cost of all the items together.

He passses an array of items to a price calculator function.

Every food item is also an item in general. It will have its own way of calculating the price.
A single class should be calling a common function that contains the different calculation methods of the items.
There could be several such classes but their interface can be the same namely SwiggyPriceCalculatorVisitor.
The class in this case is SwiggyPriceCalculatorVisitorImpl. You could have another class ZomatoPriceCalculatorVisitorImpl too
if the pricing method for Zomato is different.

Every item just has to select the 'visitor' it intends to calculate its price.
