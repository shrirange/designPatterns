
public class Biryani implements FoodItem {
	
	public Biryani(int cost) {
		this.cost = cost;
	}
	
	private int cost;
	
	public int getCost() {
		return cost;
	}

	@Override
	public int accept(SwiggyPriceCalculatorVisitor swiggyPriceCalculatorVisitor) {
		return swiggyPriceCalculatorVisitor.visit(this);
	}

}
