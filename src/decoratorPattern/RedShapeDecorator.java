package decoratorPattern;

import decoratorPattern.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decorateShape) {
		super(decorateShape);
	}

	@Override
	public void drow() {
	decorateShape.drow();
	setRedBorder(decorateShape);
	
	}
	
	private void setRedBorder(Shape decorateShape){
		System.out.println("Border color red");
	}
}
