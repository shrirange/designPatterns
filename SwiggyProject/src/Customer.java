
public class Customer {

	public static void main(String[] args) {
		
		FoodItem[] items = new FoodItem[] {
				new Biryani(500), new Pizza(1, 400), new Pizza(2, 300)
		};
		
		int totalCost = calculateCost(items, new ZomatoPriceCalculatorVisitorImpl());
		System.out.println(totalCost);
		
	}

	private static int calculateCost(FoodItem[] items, PriceCalculatorVisitor priceCalculatorVisitorImpl) {
		int sum = 0;
		
		for (FoodItem foodItem: items) {
			sum = sum + foodItem.accept(priceCalculatorVisitorImpl);
		}
		return sum;
	}

}
