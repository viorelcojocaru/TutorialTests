package builderPattern.packing;

import builderPattern.packing.packIntf.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		
		return "Bottle";
	}

}
