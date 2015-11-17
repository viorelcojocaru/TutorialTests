package abstractFactoryPattern.factory;

import abstractFactoryPattern.shapesIntf.Color;
import abstractFactoryPattern.shapesIntf.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
	public abstract Color getColor(String color);

}
