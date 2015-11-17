package abstractFactoryPattern.colorImpl;

import abstractFactoryPattern.shapesIntf.Color;

public class White implements Color {

	@Override
	public void fill() {
		System.out.println("Fill shape White");

	}

}
