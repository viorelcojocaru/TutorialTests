package abstractFactoryPattern;

import abstractFactoryPattern.factory.AbstractFactory;
import abstractFactoryPattern.factory.FactoryProducer;
import abstractFactoryPattern.shapesIntf.Color;
import abstractFactoryPattern.shapesIntf.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

	AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
	Shape shape=shapeFactory.getShape("CIRCLE");
	shape.drow();

	AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
	Color shape1=colorFactory.getColor("RED");
	shape1.fill();

	AbstractFactory shapeFactory2=FactoryProducer.getFactory("SHAPE");
	Shape shape3=shapeFactory2.getShape("SQUARE");
	shape3.drow();

	}

}
