package facadePattern;

import facadePattern.shapes.Circle;
import facadePattern.shapes.Rectangle;
import facadePattern.shapes.Square;

public class ShapeMaker {
	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	
	public ShapeMaker() {
		
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drowCircle(){
		circle.drow();
	}
	
	public void droeRectangle(){
		rectangle.drow();
	}
	
	public void drowSquare() {
		square.drow();
	}
	
	

}
