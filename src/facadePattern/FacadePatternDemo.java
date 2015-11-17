package facadePattern;

public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeMaker shapeMaker=new ShapeMaker();
		
		shapeMaker.drowCircle();
		shapeMaker.droeRectangle();
		shapeMaker.drowSquare();

	}

}
