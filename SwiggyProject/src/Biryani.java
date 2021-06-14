
public class Biryani implements FoodItem {
	
	public Biryani(int cost) {
		this.cost = cost;
	}
	
	private int cost;
	
	public int getCost() {
		return cost;
	}

	@Override
	public int accept(PriceCalculatorVisitor priceCalculatorVisitor) {
		return priceCalculatorVisitor.visit(this);
	}

	

}
