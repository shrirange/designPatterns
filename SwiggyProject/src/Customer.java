
public class Customer {

	public static void main(String[] args) {
		
		FoodItem[] items = new FoodItem[] {
				new Biryani(200), new Pizza(1, 400), new Pizza(2, 300)
		};
		
		int totalCost = calculateCost(items);
		System.out.println(totalCost);
		
	}

	private static int calculateCost(FoodItem[] items) {
		int sum = 0;
		SwiggyPriceCalculatorVisitor swiggyPriceCalculatorVisitor = new SwiggyPriceCalculatorVisitorImpl();  
		
		for (FoodItem foodItem: items) {
			sum = sum + foodItem.accept(swiggyPriceCalculatorVisitor);
		}
		return sum;
	}

}
