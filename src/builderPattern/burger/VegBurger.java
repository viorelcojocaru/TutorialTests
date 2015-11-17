package builderPattern.burger;

import builderPattern.burger.intf.Burger;

public class VegBurger extends Burger{

	@Override
	public String name() {	
		return "Vegetarian Birger";
	}

	@Override
	public float price() {
		return 5.45f;
	}

}
