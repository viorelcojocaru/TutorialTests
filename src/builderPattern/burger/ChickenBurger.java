package builderPattern.burger;

import builderPattern.burger.intf.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 6.25f;
	}

}
