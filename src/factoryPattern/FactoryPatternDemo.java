package factoryPattern;

import factoryPattern.shapes.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.drow();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.drow();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.drow();
	}

}
