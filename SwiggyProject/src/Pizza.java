
public class Pizza implements FoodItem  {
	
	private int size;
	private int price;

	public Pizza(int size, int price) {
	    this.size = size;
	    this.price = price;
	}

	public int getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int accept(SwiggyPriceCalculatorVisitor swiggyPriceCalculatorVisitor) {
		return swiggyPriceCalculatorVisitor.visit(this);
	}

}
