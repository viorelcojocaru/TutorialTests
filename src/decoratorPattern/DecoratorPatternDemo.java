package decoratorPattern;

import decoratorPattern.shapes.Circle;
import decoratorPattern.shapes.Rectangle;
import decoratorPattern.shapes.Shape;

public class DecoratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape circle= new Circle();
		
		Shape redCircle=new RedShapeDecorator(new Circle());
		Shape redRectangle =new RedShapeDecorator(new Rectangle());
		
	System.out.println("Circle with normal border");
	circle.drow();
	
	System.out.println("Circle with red border");
	redCircle.drow();
	
	System.out.println("Rectangle with red border");
	redRectangle.drow();
	
	
	}

}
