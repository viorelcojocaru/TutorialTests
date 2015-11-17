package builderPattern.drinks;

import builderPattern.Item;
import builderPattern.packing.Bottle;
import builderPattern.packing.packIntf.Packing;

public abstract class ColdDring implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
