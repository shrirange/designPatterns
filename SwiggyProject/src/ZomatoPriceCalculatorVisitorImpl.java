
public class ZomatoPriceCalculatorVisitorImpl implements PriceCalculatorVisitor {

	@Override
	public int visit(Biryani biryani) {
		if (biryani.getCost() > 400)
			return biryani.getCost() - 10;
		else
			return biryani.getCost();
	}

	@Override
	public int visit(Pizza pizza) {
		return pizza.getPrice() * pizza.getSize();
	}

}
