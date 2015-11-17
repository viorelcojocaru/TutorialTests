package flyweightPattern;

import java.util.HashMap;

import flyweightPattern.shapes.Circle;
import flyweightPattern.shapes.Shape;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Created circle of color:" + color);
		}
		return circle;
	}

}
