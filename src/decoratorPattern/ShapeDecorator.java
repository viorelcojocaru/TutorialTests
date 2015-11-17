package decoratorPattern;

import decoratorPattern.shapes.Shape;

public abstract class ShapeDecorator implements Shape{
	protected Shape decorateShape;

	public ShapeDecorator(Shape decorateShape) {
		this.decorateShape=decorateShape;
	}
	
	public void drow(){
		decorateShape.drow();
	}
}
