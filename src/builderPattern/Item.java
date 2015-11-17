package builderPattern;

import builderPattern.packing.packIntf.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public float price();

}
