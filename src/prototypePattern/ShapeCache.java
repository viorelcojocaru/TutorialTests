package prototypePattern;

import java.util.Hashtable;

import prototypePattern.shapes.Circle;
import prototypePattern.shapes.Rectangle;
import prototypePattern.shapes.Shape;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap =new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cacheShape=shapeMap.get(shapeId);
		return (Shape)cacheShape.clone();
		
	}
	
	public static void loadCash(){
		Circle circle=new Circle();
		circle.setId("circle");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setId("rectangle");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
