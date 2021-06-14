
public class SwiggyPriceCalculatorVisitorImpl implements SwiggyPriceCalculatorVisitor {

	@Override
	public int visit(Biryani biryani) {
		return biryani.getCost();
	}

	@Override
	public int visit(Pizza pizza) {
		return pizza.getPrice() * pizza.getSize();
	}

}
