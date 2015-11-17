package bridgePattern;

import bridgePattern.circles.BlueCircle;
import bridgePattern.circles.GreenCircle;
import bridgePattern.circles.RedCircle;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(10, 20, 30, new RedCircle());
		redCircle.drow();

		Shape greeCircle = new Circle(5, 60, 10, new GreenCircle());
		greeCircle.drow();

		Shape blueCircle = new Circle(15, 30, 40, new BlueCircle());
		blueCircle.drow();

	}

}
