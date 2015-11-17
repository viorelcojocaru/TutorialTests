package abstractFactoryPattern.colorImpl;

import abstractFactoryPattern.shapesIntf.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Fill shape Green");

	}

}
