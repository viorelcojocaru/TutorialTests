package abstractFactoryPattern.factory;

import abstractFactoryPattern.shapesImpl.Circle;
import abstractFactoryPattern.shapesImpl.Rectangle;
import abstractFactoryPattern.shapesImpl.Square;
import abstractFactoryPattern.shapesIntf.Color;
import abstractFactoryPattern.shapesIntf.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
			return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
