package factoryPattern;

import factoryPattern.shapes.Circle;
import factoryPattern.shapes.Rectangle;
import factoryPattern.shapes.Shape;
import factoryPattern.shapes.Square;

public class ShapeFactory {

	
	
	public Shape getShape(String shapeType){
		if (shapeType==null){
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else
			
		return null;
	}

}
