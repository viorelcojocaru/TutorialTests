package builderPattern.burger.intf;

import builderPattern.Item;
import builderPattern.packing.Wrapper;
import builderPattern.packing.packIntf.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {		
		return new Wrapper();
	}

	@Override
	public abstract float price();		

}
