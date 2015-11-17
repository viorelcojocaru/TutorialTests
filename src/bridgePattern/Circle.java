package bridgePattern;


public class Circle extends Shape {
	private int radius, x, y;
	protected Circle(int radius, int x, int y, DrowAPI drowAPI) {
		super(drowAPI);
		this.x=x;
		this.radius=radius;
		this.y=y;
	}

	@Override
	public void drow() {
	drowAPI.drowCircle(radius, x, y);	
		
	}

}
