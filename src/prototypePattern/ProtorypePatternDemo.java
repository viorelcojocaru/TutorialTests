package prototypePattern;

import prototypePattern.shapes.Rectangle;
import prototypePattern.shapes.Shape;

public class ProtorypePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeCache.loadCash();
		
		Shape cloneShape =(Shape) ShapeCache.getShape("circle");
		System.out.println("Shape: "+cloneShape.getType());

		Shape cloneShape2 =(Rectangle) ShapeCache.getShape("rectangle");
		System.out.println("Shape: "+cloneShape2.getType());

	}

}
