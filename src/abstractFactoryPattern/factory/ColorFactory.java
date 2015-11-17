package abstractFactoryPattern.factory;

import abstractFactoryPattern.colorImpl.Green;
import abstractFactoryPattern.colorImpl.Red;
import abstractFactoryPattern.colorImpl.White;
import abstractFactoryPattern.shapesIntf.Color;
import abstractFactoryPattern.shapesIntf.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {

		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("WHITE")) {
			return new White();
		}
			return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
