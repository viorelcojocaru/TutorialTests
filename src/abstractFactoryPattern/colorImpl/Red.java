package abstractFactoryPattern.colorImpl;

import abstractFactoryPattern.shapesIntf.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Fill shape Red");

	}

}
