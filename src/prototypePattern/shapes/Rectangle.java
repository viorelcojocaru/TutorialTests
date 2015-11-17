package prototypePattern.shapes;


public class Rectangle extends Shape {
	
	public Rectangle() {
		type="Rectangle";
	}
	
	@Override
	void drow() {
		System.out.println("Inside Rectangle::draw() method.");
		
	}
	
}
